package com.hunau.myboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
@Controller
public class TemplateController {
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","基于Freemarker from TemplateController.helloFtl");
        return"/helloFtl";
    }
}
