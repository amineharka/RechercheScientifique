package com.SpringProject.SpringProject.Entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Contribution {

	@EmbeddedId
	private ContributionKey idContribution;

	@ManyToOne
	@MapsId("idArticle")
	@JoinColumn(name = "idArticle")
	private Article article;

	@ManyToOne
	@MapsId("id")
	@JoinColumn(name = "id")
	private Author author;

	@Enumerated(EnumType.STRING)
	private ContributionType contribution;

	public ContributionKey getIdContribution() {
		return idContribution;
	}

	public void setIdContribution(ContributionKey idContribution) {
		this.idContribution = idContribution;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public ContributionType getContribution() {
		return contribution;
	}

	public void setContribution(ContributionType contribution) {
		this.contribution = contribution;
	}

	public Contribution(ContributionKey idContribution, Article article, Author author, ContributionType contribution) {
		super();
		this.idContribution = idContribution;
		this.article = article;
		this.author = author;
		this.contribution = contribution;
	}

	public Contribution() {
	}

}
