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

import com.SpringProject.SpringProject.Entities.Commite;
import com.SpringProject.SpringProject.Services.CommiteService;

@RestController
@RequestMapping(path = "/api/commites")
public class CommiteController {

	@Autowired
	private CommiteService commiteService;

	@GetMapping
	public ResponseEntity<List<Commite>> getAllCommite() {
		return commiteService.getAllCommites();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Commite> getCommiteById(@PathVariable("id") Long id) {
		return commiteService.getCommiteById(id);
	}

	@PostMapping
	public ResponseEntity<Commite> createCommite(@RequestBody Commite commite) {
		return commiteService.createCommite(commite);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Commite> updateCommite(@PathVariable("id") Long id, @RequestBody Commite commite) {
		return commiteService.updateCommite(id, commite);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteCommite(@PathVariable("id") Long id) {
		return commiteService.deleteCommite(id);
	}

	@DeleteMapping
	public ResponseEntity<HttpStatus> deleteAllCommites() {
		return commiteService.deleteAllCommites();
	}

}
