package com.hibernate.one_to_many_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.one_to_many_mapping.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer>
{

}
