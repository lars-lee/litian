package com.litian.web.blog.service;

import com.litian.web.blog.entity.PwdBean;
import com.litian.web.blog.mapper.PwdMapper;
import com.litian.web.blog.service.i.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
@Service
public class HelperService implements IHelperService {
    @Autowired
    private PwdMapper pwdMapper;

    @Override
    public PwdBean addPwd(PwdBean pwdBean) {
        pwdMapper.insert(pwdBean);
        return pwdBean;
    }

    @Override
    public int updatePwd(PwdBean pwdBean) {
        return pwdMapper.update(pwdBean);
    }

    @Override
    public List<PwdBean> getPwds() {
        return pwdMapper.queryPwds();
    }
}
