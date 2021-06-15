package com.SpringProject.SpringProject.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.SpringProject.SpringProject.Entities.Commite;
import com.SpringProject.SpringProject.Repository.CommiteRepository;

public class CommiteService {

	@Autowired
	CommiteRepository commiteRepository;

	public ResponseEntity<List<Commite>> getAllCommites() {

		try {
			List<Commite> commites = new ArrayList<Commite>();

			commiteRepository.findAll().forEach(commites::add);

			if (commites.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(commites, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Commite> createCommite(Commite commite) {
		try {

			Commite _commite = commiteRepository.save(new Commite(commite.getLogin(), commite.getPassword(),
					commite.getFirst_name(), commite.getLast_name()));

			return new ResponseEntity<>(_commite, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Commite> getCommiteById(Long id) {
		Optional<Commite> author = commiteRepository.findById(id);

		if (author.isPresent()) {
			return new ResponseEntity<>(author.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Commite> updateCommite(long id, Commite commite) {
		Optional<Commite> commiteData = commiteRepository.findById(id);

		if (commiteData.isPresent()) {
			Commite _author = commiteData.get();

			_author.setFirst_name(commite.getFirst_name());
			_author.setLast_name(commite.getLast_name());
			_author.setLogin(commite.getLogin());
			_author.setPassword(commite.getPassword());

			return new ResponseEntity<>(commiteRepository.save(_author), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<HttpStatus> deleteCommite(Long id) {

		try {
			commiteRepository.deleteById(id);

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<HttpStatus> deleteAllCommites() {
		try {
			commiteRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
