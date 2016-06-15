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
            if (beans != null && !beans.isEmpty()) {
                for (PwdBean bean : beans) {
                    System.out.println("mvc : bean = " + bean);
                }
            }


            String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<service>\n" +
                    " <SYS_HEAD>\n" +
                    "  <array>\n" +
                    "   <Ret>\n" +
                    "    <ReturnCode>000000</ReturnCode>\n" +
                    "    <ReturnMsg>交易成功</ReturnMsg>\n" +
                    "   </Ret>\n" +
                    "  </array>\n" +
                    " </SYS_HEAD>\n" +
                    "</service>";
            OutputStream os = response.getOutputStream();
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mav;
    }
}
