package com.wpf.jop5.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @outhor wpf
 * @date 2019/1/8 - 13:35
 */
@Entity
@Table(name="TEST_1")
@Data
public class Sdentity {
    @Id
    private String id;
    private String name;
    private String age;
}
