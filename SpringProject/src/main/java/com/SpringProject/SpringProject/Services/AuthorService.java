package com.SpringProject.SpringProject.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.SpringProject.SpringProject.Entities.Author;
import com.SpringProject.SpringProject.Repository.AuthorRepository;

public class AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	public ResponseEntity<List<Author>> getAllAuthors() {

		try {
			List<Author> authors = new ArrayList<Author>();

			authorRepository.findAll().forEach(authors::add);

			if (authors.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(authors, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Author> createAuthor(Author author) {
		try {

			Author _author = authorRepository.save(new Author(author.getLogin(), author.getPassword(),
					author.getFirst_name(), author.getLast_name(), author.getAfffiliation()));

			return new ResponseEntity<>(_author, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Author> getAuthorById(Long id) {
		Optional<Author> author = authorRepository.findById(id);

		if (author.isPresent()) {
			return new ResponseEntity<>(author.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Author> updateAuthor(long id, Author author) {
		Optional<Author> authorData = authorRepository.findById(id);

		if (authorData.isPresent()) {
			Author _author = authorData.get();

			_author.setAfffiliation(author.getAfffiliation());
			_author.setFirst_name(author.getFirst_name());
			_author.setLast_name(author.getLast_name());
			_author.setLogin(author.getLogin());
			_author.setPassword(author.getPassword());

			return new ResponseEntity<>(authorRepository.save(_author), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<HttpStatus> deleteAuthor(Long id) {

		try {
			authorRepository.deleteById(id);

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<HttpStatus> deleteAllAuthors() {
		try {
			authorRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
