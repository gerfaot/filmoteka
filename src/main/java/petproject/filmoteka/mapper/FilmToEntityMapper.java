package petproject.filmoteka.mapper;


import org.mapstruct.Mapper;
import petproject.filmoteka.dao.FilmEntity;
import petproject.filmoteka.model.Film;

@Mapper(componentModel = "spring")
public interface FilmToEntityMapper {
    FilmEntity filmToFilmEntity(Film film);
    Film filmEntityToFilm(FilmEntity filmEntity);
}
