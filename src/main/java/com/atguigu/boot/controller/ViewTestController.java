package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 @author：ZhouYao
 @create：2022-01-03 15:01
 */

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model) {

        // model中的数据会被放在请求域中  相当于request.setAttribute("a",aa)
        model.addAttribute("msg", "泥嚎，guigu");
        model.addAttribute("link", "http://www.baidu.com");

        return "success";
    }


}
