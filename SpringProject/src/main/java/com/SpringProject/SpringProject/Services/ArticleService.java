package com.SpringProject.SpringProject.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.SpringProject.SpringProject.Entities.Article;
import com.SpringProject.SpringProject.Repository.ArticleRepository;

public class ArticleService {

	@Autowired
	ArticleRepository articleRepository;

	public ResponseEntity<List<Article>> getAllArticles(String nom) {

		try {
			List<Article> articles = new ArrayList<Article>();

			if (nom == null)
				articleRepository.findAll().forEach(articles::add);
			else
				articleRepository.findByNomContaining(nom).forEach(articles::add);

			if (articles.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(articles, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Article> createArticle(Article article) {
		try {

			Article _article = articleRepository.save(
					new Article(article.getTitle(), article.getResume(), article.getContenu(), article.getEtat()));

			return new ResponseEntity<>(_article, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Article> getArticleById(Long id) {
		Optional<Article> article = articleRepository.findById(id);

		if (article.isPresent()) {
			return new ResponseEntity<>(article.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Article> updateArticle(long id, Article article) {
		Optional<Article> articleData = articleRepository.findById(id);

		if (articleData.isPresent()) {
			Article _article = articleData.get();

			_article.setTitle(article.getTitle());
			_article.setResume(article.getResume());
			_article.setContenu(article.getContenu());
			_article.setEtat(article.getEtat());

			return new ResponseEntity<>(articleRepository.save(_article), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<HttpStatus> deleteArticle(Long id) {

		try {
			articleRepository.deleteById(id);

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<HttpStatus> deleteAllArticles() {
		try {
			articleRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
