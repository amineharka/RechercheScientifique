package RevueScientifiques.RevueScientifiques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import RevueScientifiques.RevueScientifiques.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
