package com.example.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhu on 2017/7/7.
 */
@Controller
@RequestMapping("/home")
public class IndexCtrl {
    @RequestMapping(value = {"","/"}, method= RequestMethod.GET)
    public String home(){

        return "index";
    }
}
