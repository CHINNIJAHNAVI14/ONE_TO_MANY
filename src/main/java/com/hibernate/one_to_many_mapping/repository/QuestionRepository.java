package com.hibernate.one_to_many_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.one_to_many_mapping.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>
{

}
