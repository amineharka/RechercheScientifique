package com.SpringProject.SpringProject.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;

	private String title;

	private String resume;

	@Column(columnDefinition = "TEXT")
	private String contenu;

	@ElementCollection
	@CollectionTable(name = "keywords")
	private List<String> KeyWords = new ArrayList<String>();

	@Enumerated(EnumType.STRING)
	private EtatArticle etat;

	@OneToMany(mappedBy = "article")
	List<Contribution> contributions;

	@OneToMany(mappedBy = "article")
	List<Evaluation> evaluations;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public EtatArticle getEtat() {
		return etat;
	}

	public void setEtat(EtatArticle etat) {
		this.etat = etat;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public List<String> getKeyWords() {
		return KeyWords;
	}

	public void setKeyWords(List<String> keyWords) {
		KeyWords = keyWords;
	}

	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Article() {
	}

	public Article(String title, String resume, String contenu, EtatArticle etat) {
		super();
		this.title = title;
		this.resume = resume;
		this.contenu = contenu;
		this.etat = etat;
	}

}
