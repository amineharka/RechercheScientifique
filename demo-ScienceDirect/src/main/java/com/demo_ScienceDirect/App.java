package com.demo_ScienceDirect;

import static org.junit.Assert.assertTrue;




import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo_ScienceDirect.dao.DaoArticle;
import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.entity.Author;
import com.demo_ScienceDirect.services.TestService;
import com.demo_ScienceDirect.services.ArticleService;
import com.demo_ScienceDirect.services.AuthorService;
import com.demo_ScienceDirect.services.IArticleService;


public class App {
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
		/*IArticleService service = (IArticleService) context.getBean("articleService");
		Article article = new Article();
		service.ajouterArticle(article);*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
		
		
		
		
		
	
	}

}
