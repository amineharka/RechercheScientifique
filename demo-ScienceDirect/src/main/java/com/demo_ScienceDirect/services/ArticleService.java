package com.demo_ScienceDirect.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo_ScienceDirect.dao.DaoArticle;

import com.demo_ScienceDirect.entity.Article;


@Component()
public class ArticleService  {
	
	@Autowired
	public DaoArticle daoArticle;
	
	
	
	public Article ajouterArticle(Article article) {
		return daoArticle.save(article);	
	}
	
	public void supprimerArticle(Long id)
	{
		daoArticle.deleteById(id);
	}
	
	public List<Article> getAllArticles()
	{
		return daoArticle.findAll();
	}
	
	public Optional<Article> getOne(Long id)
	{
		Optional<Article> article = daoArticle.findById(id);
		return article;
	}
	

}
