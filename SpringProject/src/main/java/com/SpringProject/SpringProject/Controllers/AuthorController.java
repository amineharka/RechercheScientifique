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
import org.springframework.web.bind.annotation.RestController;

import com.SpringProject.SpringProject.Entities.Author;
import com.SpringProject.SpringProject.Services.AuthorService;

@RestController
@RequestMapping(path = "/api/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping
	public ResponseEntity<List<Author>> getAllAuthors() {
		return authorService.getAllAuthors();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Author> getAuthorById(@PathVariable("id") Long id) {
		return authorService.getAuthorById(id);
	}

	@PostMapping
	public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
		return authorService.createAuthor(author);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Author> updateAuthor(@PathVariable("id") Long id, @RequestBody Author author) {
		return authorService.updateAuthor(id, author);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteArticle(@PathVariable("id") Long id) {
		return authorService.deleteAuthor(id);
	}

	@DeleteMapping
	public ResponseEntity<HttpStatus> deleteAllAuthors() {
		return authorService.deleteAllAuthors();
	}

}
