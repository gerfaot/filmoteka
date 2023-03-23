package petproject.filmoteka.mapper;

import org.mapstruct.Mapper;
import petproject.filmoteka.model.Film;
import petproject.filmoteka.model.FilmRequest;

@Mapper(componentModel = "spring")
public interface FilmRequestToFilm {
    Film AddFilmRequestToFilm(FilmRequest filmRequest);
}
