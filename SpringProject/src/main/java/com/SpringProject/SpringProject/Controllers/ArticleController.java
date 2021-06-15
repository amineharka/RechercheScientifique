package com.SpringProject.SpringProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringProject.SpringProject.Entities.Article;
import com.SpringProject.SpringProject.Services.ArticleService;

@RestController
@RequestMapping(path = "/api/articles")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping
	public ResponseEntity<List<Article>> getAllArticles(@RequestParam(required = false) String nom) {
		return articleService.getAllArticles(nom);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable("id") Long id) {
		return articleService.getArticleById(id);
	}

	@PostMapping
	public ResponseEntity<Article> createArticle(@RequestBody Article article) {
		return articleService.createArticle(article);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Article> updateArticle(@PathVariable("id") Long id, @RequestBody Article article) {
		return articleService.updateArticle(id, article);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteArticle(@PathVariable("id") Long id) {
		return articleService.deleteArticle(id);
	}

	@DeleteMapping
	public ResponseEntity<HttpStatus> deleteAllArticles() {
		return articleService.deleteAllArticles();
	}

}
