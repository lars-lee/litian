package com.litian.web.blog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.mapper.ArticleMapper;
import com.litian.web.blog.service.i.IArticleService;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public ArticleBean addArticle(ArticleBean articleBean) {
        articleMapper.insert(articleBean);
        return articleBean;
    }

    @Override
    public ArticleBean getArticleById(Long id) {
        return articleMapper.queryArticleById(id);
    }

    @Override
    public List<ArticleBean> getArticles(int index, int size) {
        Map<String, Object> map = new HashMap<String, Object>();
        int end = index * size;
        int start = end - size;
        map.put("start", start);
        map.put("end", end);
        return articleMapper.queryArticles(map);
    }
}
