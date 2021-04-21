package com.demo_ScienceDirect.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Refree")
public class Refree extends Utilisateur{

}
