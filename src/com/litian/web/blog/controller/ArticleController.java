package com.litian.web.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.litian.web.blog.service.i.IArticleService;

@Controller
public class ArticleController {

	@Autowired 
	private IArticleService articleService;
	@ResponseBody
	@RequestMapping("/articles")
	public Object articleList() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> list =	articleService.getArticles();
		for (String string : list) {
			System.out.println(string);
		}
		map.put("list", list);
		return map;
	}

	@RequestMapping("/article/detail/{id}")
	public ModelAndView articleDetail(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("article/detail");
		mav.addObject("id", id);
		System.out.println(articleService.getArticleById(id));
		return mav;
	}
}
