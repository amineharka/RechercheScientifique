package com.demo_ScienceDirect.entity;


import java.util.HashSet;

import java.util.Set;

public class Article {

	int id;
	
	private String title ;
	
	private String resume ; 
	
	private Set<String> KeyWords = new HashSet<String>() ;
	
	private EtatArticle etat ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Set<String> getKeyWords() {
		return KeyWords;
	}

	public void setKeyWords(Set<String> keyWords) {
		KeyWords = keyWords;
	}

	public EtatArticle getEtat() {
		return etat;
	}

	public void setEtat(EtatArticle etat) {
		this.etat = etat;
	}
	
	
}
