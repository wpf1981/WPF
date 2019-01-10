package com.wpf.jop5.controller;

import com.wpf.jop5.entity.Sdentity;
import com.wpf.jop5.repository.Sdrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @outhor wpf
 * @date 2019/1/8 - 13:48
 */
@Controller
public class Sdcontroller {
    @Autowired
    Sdrepository sdrepository;

//    @GetMapping("/")

    @RequestMapping("/")
//    @ResponseBody
    public String page1(Model model){
        List<Sdentity> list=sdrepository.findAll();
        model.addAttribute("sj",list);
        System.out.println(list);
        return "test1";
    }
}
