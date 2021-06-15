package com.demo_ScienceDirect.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;

import com.demo_ScienceDirect.entity.Article;

@Qualifier
public interface IArticleService {
	
	Article ajouterArticle(Article article);
	void supprimerArticle(Long id);
	List<Article> getAllArticles();
	Optional<Article> getOne(Long id);

}
