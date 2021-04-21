package com.demo_ScienceDirect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo_ScienceDirect.entity.Author;

public interface DaoAuthor extends JpaRepository<Author, Long>{

}
