package com.litian.utils;

import com.litian.web.blog.entity.ArticleBean;
import com.litian.web.blog.entity.PwdBean;
import com.litian.web.blog.service.i.IArticleService;
import com.litian.web.blog.service.i.IHelperService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
public class DataTest {
    public static void main(String[] args) {
        String s = "哈哈哈哈哈哈哈哈哈哈哈哈哈";
        try {
            byte[] bs = s.getBytes("UTF-8");
            String ts = "";
            for (byte b :
                    bs) {
                ts+=b;
            }
            new String(bs,"UTF-8");

            System.out.println("ts.toString() = " + ts.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
        }
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml", "mybatis-config.xml");
//        IArticleService articleService = (IArticleService) ac.getBean("articleService");
        /*ArticleBean articleBean = new ArticleBean();
        articleBean.setTitle("第二篇文章");
        try {
            articleBean.setContent("中国经济未来十年的结构将发生翻天覆地的变化。第一个理由是，我们的劳动力成本已经非常高，远超过我们的邻国越南等国家；第二个理由是，劳动力成本的改变和需求的改变会引发一系列的改变，我称之为“静悄悄的革命”。".getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        articleBean.setMid(1L);
        articleBean.setCdate(new Date());
        articleBean.setUdate(new Date());
        articleBean = articleService.addArticle(articleBean);
        System.out.println("articleBean = " + articleBean);*/
       /* List<ArticleBean> articleBeanList = articleService.getArticles(1,10);
        for (ArticleBean article :
                articleBeanList) {
            System.out.println("article = " + article);
        }*/
       /*IHelperService helperService = (IHelperService) ac.getBean("helperService");
        List<PwdBean> beans = helperService.getPwds();
        for (PwdBean bean : beans) {
            System.out.println("bean = " + bean);
            System.out.println("RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()) = " + RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()));
            System.out.println("RC4.decry_RC4(bean.getEnPwd(),bean.getWebsite()) = " + RC4.decry_RC4(bean.getEnPwd(),bean.getId() + bean.getWebsite()));
//            bean.setEnPwd(RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()));
//            System.out.println("bean = " + bean);
//            helperService.update(bean);
        }*/
    }
}
