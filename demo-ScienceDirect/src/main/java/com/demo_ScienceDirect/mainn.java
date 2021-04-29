package com.demo_ScienceDirect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo_ScienceDirect.dao.DaoArticle;
import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.entity.Author;
import com.demo_ScienceDirect.services.TestService;
import com.demo_ScienceDirect.services.ArticleService;
import com.demo_ScienceDirect.services.AuthorService;


public class mainn {
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		//AuthorService service = context.getBean(AuthorService.class);
		TestService testService = new TestService();
		System.out.println(testService.somme(10,20));
	
	}

}
