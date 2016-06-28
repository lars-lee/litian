package com.litian.web.blog.controller;

import com.litian.web.blog.constant.WebConstant;
import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.service.i.IArticleService;
import com.litian.web.blog.service.i.IMemberService;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
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
        if (request.getSession() != null && (member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER)) != null) {
            List<ArticleBean> articles = articleService.getArticlesById(member.getId(), 1, 5);
            mav.addObject("articles", articles);
            mav.addObject("member", member);
        } else {
            List<ArticleBean> articles = articleService.getArticles(1, 5);
            mav.addObject("articles", articles);
        }
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
            if (member instanceof MemberBean) {
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
    public Object getArticles(HttpServletRequest request, Integer pageIndex, Integer pageSize) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ArticleBean> articles;
        pageIndex = (pageIndex == null) ? 1 : pageIndex;
        pageSize = (pageSize == null) ? 5 : pageSize;
        MemberBean member;
        if (request.getSession() != null && (member = (MemberBean) request.getSession().getAttribute(WebConstant.SESSION_MEMBER)) != null) {
            articles = articleService.getArticlesById(member.getId(), pageIndex, pageSize);
        } else {
            articles = articleService.getArticles(pageIndex, pageSize);
        }
        map.put("articles", articles);

        try {
            Configuration cfg = new Configuration();
            cfg.setDirectoryForTemplateLoading(new File(request.getSession().getServletContext().getRealPath("") + "/site/article"));
            cfg.setObjectWrapper(new DefaultObjectWrapper());
            Template tmp = cfg.getTemplate("articleList.ftl");
            Writer out = new OutputStreamWriter(System.out);
            tmp.process(map, out);
            out.flush();
            String str = "";
            out.write(str);
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return map;
    }
}
