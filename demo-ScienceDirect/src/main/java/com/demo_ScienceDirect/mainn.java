package com.demo_ScienceDirect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.services.ArticleServ;
import com.demo_ScienceDirect.services.ArticleService;

public class mainn {
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
		ArticleServ articleService = context.getBean("service",ArticleServ.class);
		
		Article article = new Article();
		
		articleService.ajouterArticle(article);
	
	}

}
