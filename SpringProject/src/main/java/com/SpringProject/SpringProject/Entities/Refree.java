package com.SpringProject.SpringProject.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Refree {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	protected String login;
	protected String password;
	protected String first_name;
	protected String last_name;

	@OneToMany(mappedBy = "refree")
	List<Evaluation> evaluations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Refree(String login, String password, String first_name, String last_name, List<Evaluation> evaluations) {
		super();
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.evaluations = evaluations;
	}

	public Refree() {
		super();
	}

}
