package com.litian.web.blog.controller;

import com.litian.utils.MD5;
import com.litian.utils.RC4;
import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.service.i.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.litian.web.blog.service.i.IMemberService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberController {

    @Autowired
    private IMemberService memberService;
    @Autowired
    private IArticleService articleService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        MemberBean member;
        if (request.getSession() != null) {
            member = (MemberBean) request.getSession().getAttribute("member");
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            return "member/index";
        }
        return "member/login";
    }

    @RequestMapping("/signin")
    @ResponseBody
    public Object signin(String username, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("\"aaaaaaaaa\" = " + "aaaaaaaaa");
        map.put("status", true);
        return map;
    }

    @RequestMapping("/register")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView("member/register");
        return mav;
    }

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mav;
        MemberBean member;
        if (request.getSession() != null) {
            member = (MemberBean) request.getSession().getAttribute("member");
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            mav = new ModelAndView("member/index");
            List<ArticleBean> articles = articleService.getArticles(1, 10);
            mav.addObject("articles", articles);
        } else {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            member = memberService.getMemberByUsername(username);
            if (member != null && verify(username, password, member.getPassword())) {
                mav = new ModelAndView("member/index");
                List<ArticleBean> articles = articleService.getArticles(1, 10);
                mav.addObject("articles", articles);
                request.getSession().setAttribute("member", member);
            } else {
                mav = new ModelAndView("member/login");
            }
        }
        return mav;
    }

    @RequestMapping("/registerResult")
    public ModelAndView registerResult(HttpServletRequest request) {
        ModelAndView mav;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
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

    private boolean verify(String username, String password, String enPassword) {
        if (username == null || password == null || enPassword == null) return false;
        if (enPassword.equals(encrypt(username, password))) return true;
        else return false;
    }

    private String encrypt(String username, String password) {
        return MD5.encrypt(RC4.encry_RC4(password, username));
    }
}
