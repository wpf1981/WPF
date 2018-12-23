package com.wpf.jop3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MytestController {

    @Autowired
    MytestRepository mytestRepository;

    @GetMapping("/")
    @Cacheable(value = "page")
    public String page(){
        List<MytestEntity> all = mytestRepository.findAll();
        return all.toString();
    }
}
