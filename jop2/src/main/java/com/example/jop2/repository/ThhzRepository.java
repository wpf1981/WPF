package com.example.jop2.repository;

import com.example.jop2.entity.Thhz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @outhor wpf
 * @date 2018/12/20 - 14:01
 */

public interface ThhzRepository extends JpaRepository<Thhz,String> {

    List<Thhz> findByThrq(String s);

}
