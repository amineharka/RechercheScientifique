package com.demo_ScienceDirect.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Visiteur")
public class Visiteur extends Utilisateur {

}
