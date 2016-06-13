package com.litian.web.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.litian.web.blog.service.i.IArticleService;

@Service
public class ArticleService implements IArticleService {

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
