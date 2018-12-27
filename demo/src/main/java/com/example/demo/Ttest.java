package com.example.demo;

import org.springframework.util.DigestUtils;


public class Ttest {
    public String ok(String md){
        String uu= DigestUtils.md5DigestAsHex(md.getBytes());
        return uu;
    }
}
