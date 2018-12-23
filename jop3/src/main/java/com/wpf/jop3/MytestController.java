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

/* @Cacheable先查看缓存是否存在，没有就追加，常用于查询
@CachePut 直接将返回值存入缓存，常用于保存和修改
 @CacheEvict清除缓存*/

    @GetMapping("/")
    @Cacheable(value = "page")
    public String page(){
        List<MytestEntity> all = mytestRepository.findAll();
        return all.toString();
    }
}
