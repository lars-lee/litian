package com.litian.web.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.litian.web.blog.service.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {

	@Override
	public List<String> getArticles() {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < 6; i++) {
			list.add(""+1);
		}
		return list;
	}

	@Override
	public String getArticleById(Long id) {
		return "第"+id+"篇文章";
	}

}
