package com.demo_ScienceDirect.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo_ScienceDirect.dao.DaoArticle;
import com.demo_ScienceDirect.dao.DaoArticleImpl;
import com.demo_ScienceDirect.entity.Article;


@Component("service")
public class ArticleService implements ArticleServ {
	
	
	public DaoArticleImpl daoArticle;
	
	@Autowired
	public ArticleService(DaoArticleImpl daoArticle) {
		this.daoArticle = daoArticle;
	}

	
	public void ajouterArticle(Article article) {
		daoArticle.save(article);
	}

}
