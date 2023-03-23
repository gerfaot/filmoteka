package petproject.filmoteka.dao;

import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<FilmEntity, Long> {
}

