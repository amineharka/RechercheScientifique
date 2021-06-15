package com.demo_ScienceDirect.services;


import java.util.List;

import java.util.Optional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo_ScienceDirect.dao.DaoArticle;

import com.demo_ScienceDirect.entity.Article;


@Service
public class ArticleService  implements IArticleService{
	
	
	
	@Autowired
	public DaoArticle daoArticle;
	
	
	@Override
	public Article ajouterArticle(Article article) {
		return daoArticle.save(article);
	}
	
	@Override
	public void supprimerArticle(Long id)
	{
		daoArticle.deleteById(id);
	}
	
	@Override
	public List<Article> getAllArticles()
	{
		return daoArticle.findAll();
	}
	
	@Override
	public Optional<Article> getOne(Long id)
	{
		Optional<Article> article = daoArticle.findById(id);
		return article;
	}
	

	
	
	
	

}
