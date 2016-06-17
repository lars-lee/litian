package com.litian.web.blog.service.i;

import com.litian.web.blog.entity.ArticleBean;

import java.util.List;

public interface IArticleService {

	ArticleBean addArticle(ArticleBean articleBean);

	ArticleBean getArticleById(Long id);

	List<ArticleBean> getArticles(int index, int size);
}
