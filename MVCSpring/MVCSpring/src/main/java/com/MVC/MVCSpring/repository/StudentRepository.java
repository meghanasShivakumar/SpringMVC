package com.MVC.MVCSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MVC.MVCSpring.entity.Student;
// two jpa repo type of jpa entity and type of primary key
//there is default @ reposit and transaction inside jpa repo
public interface StudentRepository  extends JpaRepository<Student, Long>{

}