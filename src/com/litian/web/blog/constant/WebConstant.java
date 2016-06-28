package com.litian.web.blog.constant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by litian on 2016/6/15.
 */
public class WebConstant {

    public static String DEFAULT_CHARSET = "UTF-8";
    public static String REGEX_MOBILE = "((13[0-9])|(15[^4,\\D])|(147)|(154)|(18[0,2-3,5-9]))\\d{8}";
    public static String REGEX_MAIL = "\\w+@(\\w+.)+[a-z]{2,3}";
    public static String REGEX_NUMBER = "\\d+";
    public static String SESSION_MEMBER = "member";

    public static List<String> QUERY_DATES;

    static {
        QUERY_DATES = new ArrayList<String>();
        Calendar c = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            QUERY_DATES.add(c.get(Calendar.YEAR) + " - " + leftPadding(c.get(Calendar.MONTH) + 1));
            c.add(Calendar.MONTH, -1);
        }
    }

    private static String leftPadding(int month) {
        if (0 < month && month <= 12) return String.valueOf(month).length() == 1 ? "0" + month : month + "";
        else return "";
    }
}
