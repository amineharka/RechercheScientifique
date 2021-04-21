package com.demo_ScienceDirect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo_ScienceDirect.entity.Article;

public interface DaoArticle extends JpaRepository<Article, Long> {

}
