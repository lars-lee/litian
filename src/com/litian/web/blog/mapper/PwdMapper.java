package com.litian.web.blog.mapper;

import com.litian.generator.entity.Pwd;
import com.litian.web.blog.entity.PwdBean;

import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
public interface PwdMapper {

    int insert(PwdBean pwdBean);

    int update(PwdBean pwdBean);

    List<PwdBean> queryPwds();
}
