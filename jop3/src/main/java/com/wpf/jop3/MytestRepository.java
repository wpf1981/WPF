package com.wpf.jop3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MytestRepository extends JpaRepository<MytestEntity,String> {

//    List<MytestEntity> findById(String i);
}
