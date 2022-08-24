package com.doconnect.doconnectservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doconnect.doconnectservice.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}