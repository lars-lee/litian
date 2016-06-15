package com.litian.web.blog.service.i;

import com.litian.web.blog.entity.PwdBean;

import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
public interface IHelperService {

    PwdBean addPwd(PwdBean pwdBean);

    int updatePwd(PwdBean pwdBean);

    List<PwdBean> getPwds();
}
