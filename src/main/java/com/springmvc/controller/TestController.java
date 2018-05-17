package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by luohw on 2018/5/17 0017.
 */
@Controller
@RequestMapping(value = "/controller")
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        System.out.println("====test====");
    }
}


