package RevueScientifiques.RevueScientifiques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import RevueScientifiques.RevueScientifiques.entities.Auteur;

public interface DaoAuthor extends JpaRepository<Auteur, Long>{

}
