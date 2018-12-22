package com.example.jop2.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @outhor wpf
 * @date 2018/12/20 - 13:54
 */
@Entity(name = "W_THYYHZ")
@Data
public class Thhz {
    @Id
    private String id;

    @Column
    private String thrq;

    @Column
    private String thyy;

    @Column
    private int zs;
}
