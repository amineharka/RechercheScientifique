package com.SpringProject.SpringProject.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation {

	@Id
	private Long idEvaluation;

	@ManyToOne
	@JoinColumn(name = "id_article")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "id_refree")
	private Refree refree;

	@Enumerated(EnumType.STRING)
	private EvaluationEnum evaluation;

	private String commentaire;

	public Evaluation(Article article, Refree refree, EvaluationEnum evaluation, String commentaire) {
		super();
		this.article = article;
		this.refree = refree;
		this.evaluation = evaluation;
		this.commentaire = commentaire;
	}

	public Long getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(Long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Refree getRefree() {
		return refree;
	}

	public void setRefree(Refree refree) {
		this.refree = refree;
	}

	public EvaluationEnum getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationEnum evaluation) {
		this.evaluation = evaluation;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Evaluation() {
		super();
	}

}
