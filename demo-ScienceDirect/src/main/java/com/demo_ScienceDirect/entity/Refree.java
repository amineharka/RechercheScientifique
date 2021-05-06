package com.demo_ScienceDirect.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Refree")
public class Refree extends Utilisateur{

	
	@OneToMany(mappedBy = "refree")
	List<Evaluation> evaluations;

	
}
