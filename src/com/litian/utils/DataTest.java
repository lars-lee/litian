package com.litian.utils;

import com.litian.web.blog.entity.PwdBean;
import com.litian.web.blog.service.i.IHelperService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
public class DataTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml", "mybatis-config.xml");
        IHelperService helperService = (IHelperService) ac.getBean("helperService");
        List<PwdBean> beans = helperService.getPwds();
        for (PwdBean bean : beans) {
            System.out.println("bean = " + bean);
            System.out.println("RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()) = " + RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()));
            System.out.println("RC4.decry_RC4(bean.getEnPwd(),bean.getWebsite()) = " + RC4.decry_RC4(bean.getEnPwd(),bean.getId() + bean.getWebsite()));
//            bean.setEnPwd(RC4.encry_RC4(bean.getPwd(), bean.getId() + bean.getWebsite()));
//            System.out.println("bean = " + bean);
//            helperService.update(bean);
        }
    }
}
