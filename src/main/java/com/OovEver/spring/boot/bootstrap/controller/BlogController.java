package com.OovEver.spring.boot.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author OovEver
 * @Date 2017/12/23 17:11
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {
    @GetMapping
    public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
                            @RequestParam(value="keyword",required=false) String Keyword) {
        System.out.print("order:" +order + ";keyword:" +Keyword );
        return "redirect:/index?order="+order+"&keyword="+Keyword;
    }
}
