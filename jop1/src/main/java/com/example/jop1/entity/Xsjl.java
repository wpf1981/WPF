package com.example.jop1.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @outhor wpf
 * @date 2018/12/19 - 9:28
 * 第二步
 * 这是一个实体类，需要JPA注解
 * 与数据库里的实体表或视图对应
 * @Entity和@ID主键必须
 * @Table定义表名
 * @Data插件lombok自动添加set和get方法，减少代码量
 * @Column定义字段
 */
@Entity
@Table(name = "W_XSJL")
@Data
public class Xsjl {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "XSDID")
    private String xsdid;
//    @Column(name = "RQ")
//    private String rq;
//    @Column(name = "KHID")
//    private String khid;
    @Column(name = "KHMC")
    private String khmc;
//    @Column(name = "SPID")
    private String spid;
    @Column(name = "SPMC")
    private String spmc;
    @Column(name = "GG")
    private String gg;
    @Column(name = "CD")
    private String cd;
//    @Column(name = "BZ")
//    private String bz;
//    @Column(name = "DW")
    private String dw;
    @Column(name = "PH")
    private String ph;
//    @Column(name = "SCRQ")
//    private String scrq;
//    @Column(name = "YXQ")
//    private String yxq;
    @Column(name = "SL")
    private String sl;
    @Column(name = "DJ")
    private String dj;
    @Column(name = "JE")
    private String je;
//    @Column(name = "GYSID")
//    private String gysid;
//    @Column(name = "GYSMC")
//    private String gysmc;
//    @Column(name = "KPYID")
//    private String kpyid;
//    @Column(name = "KPYMC")
//    private String kpymc;
//    @Column(name = "YWYID")
//    private String ywyid;
//    @Column(name = "YWYMC")
//    private String ywymc;


}
