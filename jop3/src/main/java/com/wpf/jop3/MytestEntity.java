package com.wpf.jop3;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TT1")
@Data
public class MytestEntity {
    @Id
    private String id;
    private String name;
    private String age;
}
