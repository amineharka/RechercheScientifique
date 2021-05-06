package RevueScientifiques.RevueScientifiques.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	//une affiliation b7al keywords 
	//faut externaliser les keys word
	private List<String> keywords = new ArrayList<String>();
	private String resume;
	private String titre;
	
	//enum fiha les etats accpter ..
	private EtatArticle etatArticle;
	
	private Auteur auteur;

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public EtatArticle getEtatArticle() {
		return etatArticle;
	}

	public void setEtatArticle(EtatArticle etatArticle) {
		this.etatArticle = etatArticle;
	}

	public Article() {
		super();
	}

	public Article(Long idArticle, List<String> keywords, String resume, EtatArticle etatArticle) {
		super();
		this.idArticle = idArticle;
		this.keywords = keywords;
		this.resume = resume;
		this.etatArticle = etatArticle;
	}

	public Article(List<String> keywords, String resume, EtatArticle etatArticle) {
		super();
		this.keywords = keywords;
		this.resume = resume;
		this.etatArticle = etatArticle;
	}
	
	
	
	
}
