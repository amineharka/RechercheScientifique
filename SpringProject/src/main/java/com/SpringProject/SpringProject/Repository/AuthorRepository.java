package com.SpringProject.SpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.SpringProject.Entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	List<Author> findByNomContaining(String nom);

}
