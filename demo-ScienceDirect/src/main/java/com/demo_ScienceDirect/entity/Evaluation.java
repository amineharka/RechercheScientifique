package com.demo_ScienceDirect.entity;

import javax.persistence.*;

@Entity
public class Evaluation {

	@Id
	private Long idEvaluation;
	
	@ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "id_refree")
    private Referee refree;
    
	@Enumerated(EnumType.STRING)
	private EvaluationEnum evaluation ;
	
	private String commentaire;
}
