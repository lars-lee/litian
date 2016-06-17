package com.litian.web.blog.util;

import com.litian.web.blog.constant.WebConstant;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by litian on 2016/6/17.
 */
public class ByteArrayToString implements TemplateMethodModel {
    @Override
    public Object exec(List list) throws TemplateModelException {
        if (null != list && !list.isEmpty()) {
            String str = (String) list.get(0);
            StringTokenizer st = new StringTokenizer(str, ",");
            List<Integer> ints = new ArrayList<Integer>();
            while (st.hasMoreElements()) {
                ints.add(Integer.parseInt(String.valueOf(st.nextElement())));
            }
            byte[] bs = new byte[ints.size()];
            int index = 0;
            for (int i : ints) {
                bs[index] = (byte) i;
                index++;
            }
            try {
                return new String(bs, WebConstant.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
