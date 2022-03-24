package com.example.jop1.repository;

import com.example.jop1.entity.Xsjl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;

/**
 * @outhor wpf
 * @date 2018/12/19 - 9:32
 * 第三部定义接口继承JpaRepository
 *
 *
 *
 */


public interface XsjlRepository extends JpaRepository<Xsjl,String> {

    //使用findBy的语法让jpa自动生成查询语句
    List<Xsjl> findByXsdidIn(List<String> ss);

    //自定义查询语句 ？1为传入参数
    @Query(value = "SELECT SUM(SALE_MNY) FROM SD_SALELOGD WHERE SALELOG_NO IN ?1",nativeQuery = true)
    String sumByJeIn(List<String> list);

    @Query(value = "SELECT SUM(SALE_MNY) DXJE,SUM(SALE_MNY) XXJE FROM SD_SALELOGD WHERE SALELOG_NO IN ?1",nativeQuery = true)
    String rmbZh(List<String> list);

}
