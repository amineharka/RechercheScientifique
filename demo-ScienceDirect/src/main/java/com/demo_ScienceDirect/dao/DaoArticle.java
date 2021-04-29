package com.demo_ScienceDirect.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo_ScienceDirect.entity.Article;


public interface DaoArticle extends JpaRepository<Article, Long> {
	
}
