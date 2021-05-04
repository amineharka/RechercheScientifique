package com.demo_ScienceDirect.dao;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;


import com.demo_ScienceDirect.entity.Article;

@Qualifier
public interface DaoArticle extends JpaRepository<Article, Long> {
	
}
