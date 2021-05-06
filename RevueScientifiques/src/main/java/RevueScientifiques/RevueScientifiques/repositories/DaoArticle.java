package RevueScientifiques.RevueScientifiques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RevueScientifiques.RevueScientifiques.entities.Article;

@Repository
public interface DaoArticle extends JpaRepository<Article, Long>{

}
