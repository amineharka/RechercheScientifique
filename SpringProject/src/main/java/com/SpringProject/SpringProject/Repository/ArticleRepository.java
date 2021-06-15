package com.SpringProject.SpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.SpringProject.Entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	List<Article> findByNomContaining(String nom);
}
