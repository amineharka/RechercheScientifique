package com.demo_ScienceDirect.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Author")
public class Author extends Utilisateur{
	
	@Enumerated(EnumType.STRING)
	private Affiliation afffiliation;
	
	@OneToMany(mappedBy = "author")
	List<Contribution> contributions;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Affiliation getAfffiliation() {
		return afffiliation;
	}

	public void setAfffiliation(Affiliation afffiliation) {
		this.afffiliation = afffiliation;
	}

	public Author(int id, String login, String password, String first_name, String last_name,
			Affiliation afffiliation) {
		super(id, login, password, first_name, last_name);
		this.afffiliation = afffiliation;
	}
	
	public Author() {}
	
	
	
}
