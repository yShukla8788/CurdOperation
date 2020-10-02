package com.assignment.revise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.revise.model.Relative;

public interface RelativeRepository extends JpaRepository<Relative, Long> {

}
