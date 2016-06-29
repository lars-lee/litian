package com.litian.web.blog.controller;

import com.litian.web.blog.constant.WebConstant;
import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.service.i.IArticleService;
import com.litian.web.blog.service.i.IMemberService;
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
    @Autowired
    private IMemberService memberService;

    @RequestMapping("/articles")
    public ModelAndView articles(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("article/list");
        MemberBean member;
        Long mid = null;
        if (request.getSession() != null && (member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER)) != null) {
            mav.addObject("member", member);
            mid = member.getId();
        } else {
        }
        List<ArticleBean> articles = articleService.getArticlesByCondition(mid, null, 1, 5);
        mav.addObject("articles", articles);
        mav.addObject("queryDates", WebConstant.QUERY_DATES);
        return mav;
    }

    @RequestMapping("/article/detail/{id}")
    public ModelAndView articleDetail(HttpServletRequest request, @PathVariable("id") Long id) {
        ModelAndView mav = new ModelAndView("article/detail");
        ArticleBean articleBean;
        if (id != null && id.toString().matches(WebConstant.REGEX_NUMBER)) {
            articleBean = articleService.getArticleById(id);
            mav.addObject("article", articleBean);
            MemberBean author = memberService.getMemberById(articleBean.getMid());
            mav.addObject("author", author);
            MemberBean member;
            if (request.getSession() != null) {
                member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER);
            } else {
                member = null;
            }
            if (member != null) {
                mav.addObject("member", member);
            }
        } else {
            mav = new ModelAndView("article/anote");
            return mav;
        }
        return mav;
    }

    @RequestMapping("/getArticles")
    @ResponseBody
    public Object getArticles(HttpServletRequest request, String queryDate, Integer pageIndex, Integer pageSize) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ArticleBean> articles;
        pageIndex = (pageIndex == null) ? 1 : pageIndex;
        pageSize = (pageSize == null) ? 5 : pageSize;
        if (queryDate != null && "".equals(queryDate)) {
            queryDate = null;
        }
        Long mid = null;
        MemberBean member;
        if (request.getSession() != null && (member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER)) != null) {
            mid = member.getId();
        }
        articles = articleService.getArticlesByCondition(mid, queryDate, pageIndex, pageSize);
        map.put("articles", articles);
        return map;
    }


}
