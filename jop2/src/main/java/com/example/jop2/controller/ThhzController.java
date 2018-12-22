package com.example.jop2.controller;

import com.example.jop2.entity.Thhz;
import com.example.jop2.repository.ThhzRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @outhor wpf
 * @date 2018/12/20 - 14:05
 */
@Controller
public class ThhzController {

    @Resource
    ThhzRepository thhzRepository;

    @RequestMapping("/")
    public String page1(Model model){
        List<Thhz> list=thhzRepository.findAll();
        model.addAttribute("sj",list);
        return "thhz";
    }

    @RequestMapping("/thhz")
//    @ResponseBody
    public String page2(Model model,String thrq){
        List<Thhz> list=thhzRepository.findByThrq(thrq);
        model.addAttribute("sj",list);
        return "thhz";
    }

}
