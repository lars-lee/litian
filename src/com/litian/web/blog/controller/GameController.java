package com.litian.web.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by litian on 2016/6/24.
 */
public class GameController {

    @RequestMapping("/games")
    public ModelAndView gameList() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
}
