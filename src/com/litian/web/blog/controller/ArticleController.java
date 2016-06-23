package com.litian.web.blog.controller;

import com.litian.web.blog.constant.WebConstant;
import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.service.i.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping("/articles")
    public ModelAndView golists(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("article/list");
        MemberBean member;
        if (request.getSession() != null && (member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER)) != null) {
            List<ArticleBean> articles = articleService.getArticlesById(member.getId(), 1, 5);
            mav.addObject("articles", articles);
            mav.addObject("member", member);
        } else {
            List<ArticleBean> articles = articleService.getArticles(1, 5);
            mav.addObject("articles", articles);
        }
        return mav;
    }

    @RequestMapping("/article/detail/{id}")
    public ModelAndView articleDetail(HttpServletRequest request, @PathVariable("id") Long id) {
        ModelAndView mav = new ModelAndView("article/detail");
        ArticleBean articleBean;
        if (id != null && id.toString().matches(WebConstant.REGEX_NUMBER)) {
            articleBean = articleService.getArticleById(id);
            mav.addObject("article", articleBean);
            MemberBean member;
            if (request.getSession() != null) {
                member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER);
            } else {
                member = null;
            }
            if (member instanceof MemberBean) {
                mav.addObject("member", member);
            }
        } else {
            mav = new ModelAndView("article/anote");
            return mav;
        }
        return mav;
    }

}
