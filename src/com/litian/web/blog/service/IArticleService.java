package com.litian.web.blog.service;

import java.util.List;

public interface IArticleService {

	public List<String> getArticles();
	
	public String getArticleById(Long id);
}
