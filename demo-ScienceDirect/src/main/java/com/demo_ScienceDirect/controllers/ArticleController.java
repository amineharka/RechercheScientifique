package com.demo_ScienceDirect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.services.ArticleService;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

	@Autowired
	private ArticleService articleService ;
	
	
	@GetMapping
	public List<Article> getAllArticles()
	{
		return articleService.getAllArticles();
	}
}
