package com.demo_ScienceDirect.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Visiteur")
public class Commite extends Utilisateur {
	
	
	
}
