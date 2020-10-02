package com.assignment.revise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.revise.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
