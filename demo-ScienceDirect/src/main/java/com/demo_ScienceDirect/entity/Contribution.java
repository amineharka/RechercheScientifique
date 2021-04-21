package com.demo_ScienceDirect.entity;

import javax.persistence.*;

@Entity
public class Contribution {
	
	@EmbeddedId
	private ContributionKey idContribution;
	
	
    @ManyToOne
    @MapsId("articleId")
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(name = "idAuthor")
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
	
	public Contribution() {}
    
    

}
