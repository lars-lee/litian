package com.litian.web.blog.service.i;

import java.util.List;

public interface IArticleService {

	List<String> getArticles();
	
	String getArticleById(Long id);
}
