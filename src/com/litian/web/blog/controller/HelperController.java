package com.litian.web.blog.controller;

import com.litian.web.blog.entity.PwdBean;
import com.litian.web.blog.service.i.IHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by litian on 2016/6/13.
 */
@Controller
public class HelperController {

    @Autowired
    private IHelperService helperService;

    @RequestMapping("/helper")
    public ModelAndView helper(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        try {
            List<PwdBean> beans = helperService.getPwds();
            OutputStream os = response.getOutputStream();
            if (beans != null && !beans.isEmpty()) {
                os.write(beans.toString().getBytes());
                for (PwdBean bean : beans) {
                    System.out.println("bean = " + bean);
                }
            }else{
                os.write("no results!".getBytes());
            }
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mav;
    }
}
