package com.demo_ScienceDirect.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Referee")
public class Referee extends Utilisateur{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReferee;
	
	private String nom ;
	
	private String prenom ;
	
	private String commentaire ;
	
	@OneToMany(mappedBy = "refree")
	List<Evaluation> evaluations;
	
	public Referee() {
		
	}

	
	public Referee(int id, String login, String password, String first_name, String last_name, Long string,
			String nom, String prenom, String commentaire) {
		super(id, login, password, first_name, last_name);
		this.idReferee = string;
		this.nom = nom;
		this.prenom = prenom;
		this.commentaire = commentaire;
	}

	public Long getIdReferee() {
		return idReferee;
	}

	public void setIdReferee(Long idReferee) {
		this.idReferee = idReferee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	
}
