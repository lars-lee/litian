package com.litian.web.blog.controller;

import com.litian.utils.MD5;
import com.litian.utils.RC4;
import com.litian.web.blog.constant.WebConstant;
import com.litian.web.blog.entity.MemberBean;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.litian.web.blog.service.i.IMemberService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MemberController {

    @Autowired
    private IMemberService memberService;

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
        return "member/signin";
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
            System.out.println("member = " + member);
        } else {
            member = null;
        }
        if (member instanceof MemberBean) {
            mav = new ModelAndView("member/index");
        } else {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            member = memberService.getMemberByUsername(username);
            if (member != null && verify(username, password, member.getPassword())) {
                mav = new ModelAndView("member/index");
                request.getSession().setAttribute("member", member);
            } else {
                mav = new ModelAndView("member/signin");
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
