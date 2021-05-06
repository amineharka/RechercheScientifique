package RevueScientifiques.RevueScientifiques.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Auteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAuthor;
	private String coord;
	private String nom;
	private List<Long> idCoEuteurs;
	
	//many to many relation avec entity porteuse
	@OneToMany
	@JoinColumn(name = "Article_ID", referencedColumnName = "idArticle")
	private List<Article> articles;
	
}
