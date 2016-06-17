package com.litian.web.blog.mapper;

import com.litian.web.blog.entity.ArticleBean;

import java.util.List;
import java.util.Map;

/**
 * Created by litian on 2016/6/16.
 */
public interface ArticleMapper {

    int insert(ArticleBean articleBean);

    ArticleBean queryArticleById(Long id);

    List<ArticleBean> queryArticles(Map<String, Object> map);
}
