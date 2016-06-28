package com.litian.web.blog.controller;

import com.litian.utils.MD5;
import com.litian.utils.RC4;
import com.litian.web.blog.constant.WebConstant;
import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.service.i.IArticleService;
import com.litian.web.blog.service.i.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MemberController {

    @Autowired
    private IMemberService memberService;
    @Autowired
    private IArticleService articleService;

    /**
     * 进入注册页面
     *
     * @param request
     * @return
     */
    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("member/register");
        MemberBean member;
        if (request.getSession() != null) {
            member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER);
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            mav = new ModelAndView("member/index");
        }
        return mav;
    }

    /**
     * 注册并返回结果
     * TODO 注册页面添加ajax验证功能，提升用户体验
     *
     * @param request
     * @return
     */
    @RequestMapping("/registerResult")
    public ModelAndView registerResult(HttpServletRequest request) {
        ModelAndView mav;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            // TODO 验证是否已经注册
            // TODO 扩展支持邮箱或者手机号或者昵称注册
            MemberBean memberBean = new MemberBean();
            memberBean.setMail(username);
            memberBean.setPassword(encrypt(username, password));
            memberBean = memberService.addMember(memberBean);
            if (memberBean.getId() != null) {
                mav = new ModelAndView("member/register_success");
                return mav;
            }
        }
        mav = new ModelAndView("member/register");
        return mav;
    }

    /**
     * 进入登录页面
     *
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        MemberBean member;
        if (request.getSession() != null) {
            member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER);
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            return "redirect:/index";
        }
        return "member/login";
    }

    /**
     * 退出登录
     *
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        if (request.getSession() != null) {
            request.getSession().removeAttribute(WebConstant.SESSION_MEMBER);
        }
        return "member/login";
    }

    /**
     * ajax登录验证
     *
     * @param request
     * @return
     */
    @RequestMapping("/signin")
    @ResponseBody
    public Object signin(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", true);
        MemberBean member;
        if (request.getSession() != null) {
            member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER);
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            return "you have logged in!<a href = '" + request.getContextPath() + "/index'>back to index</a>";
        } else {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            member = memberService.getMemberByUsername(username);
            if (member != null && verify(username, password, member.getPassword())) {
                request.getSession().setAttribute(WebConstant.SESSION_MEMBER, member);
            } else {
                map.put("status", false);
                map.put("msg", "用户名或密码错误!");
            }
        }
        return map;
    }

    /**
     * 进入首页
     *
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("member/index");
        return mav;
    }


    private boolean verify(String username, String password, String enPassword) {
        if (username == null || password == null || enPassword == null) return false;
        if (enPassword.equals(encrypt(username, password))) return true;
        else return false;
    }

    private String encrypt(String username, String password) {
        return MD5.encrypt(RC4.encry_RC4(password, username));
    }
}
