package com.litian.web.blog.controller;

import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.service.i.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @ResponseBody
    @RequestMapping("/articles")
    public Object articleList() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ArticleBean> articleBeanList = articleService.getArticles(1, 10);
        map.put("list", articleBeanList);
        return map;
    }

    @RequestMapping("/article/detail/{id}")
    public ModelAndView articleDetail(@PathVariable("id") Long id) {
        ModelAndView mav = new ModelAndView("article/detail");
        ArticleBean articleBean = articleService.getArticleById(id);
        mav.addObject("article", articleBean);
        return mav;
    }
}
