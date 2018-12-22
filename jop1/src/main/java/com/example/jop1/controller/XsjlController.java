package com.example.jop1.controller;

import com.example.jop1.repository.XsjlRepository;
import org.dom4j.xpath.DefaultXPath;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @outhor wpf
 * @date 2018/12/19 - 9:35
 * 第四部定义控制层
 * @Controller
 *
 *
 *
 */
@Controller
public class XsjlController {
    //注入接口
    @Resource
    XsjlRepository xsjlRepository;

    //解析路径
    @RequestMapping("/")
    public String page(){
        return "index";
    }



    @RequestMapping("/xsjl")
//    @ResponseBody
    public String page1(Model model,String ids){

        //创建变量
        List<String> list = new ArrayList<>();
        //获取传入参数并加入字符 数组
        String[] idsStr = ids.split(",");
        //for遍历数组并添加到列表list变量中
        for (String id : idsStr) {
            list.add(id);
        }
//        model.addAttribute("je",xsjlRepository.sumByJeIn(list));
        //利用自定义方法，以自定义列表为查询条件，获取数组值，并用split指定截取分隔符
        String[] xx=xsjlRepository.rmbZh(list).split(",");
        //model的addattribute把获取的变量传入到前段网页的对应变量中
        model.addAttribute("dx",xx);
        model.addAttribute("SJ",xsjlRepository.findByXsdidIn(list));
//        model.addAttribute("kh",xsjlRepository.findByXsdidIn(list).get(1));
//        System.out.println(xsjlRepository.rmbZh(list));
//        System.out.println(xx);

        //返回访问路径给模板解析器
        return "main";
    }
}
