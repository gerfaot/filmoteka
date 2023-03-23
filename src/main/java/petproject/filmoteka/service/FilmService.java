package petproject.filmoteka.service;

import petproject.filmoteka.model.Film;

import java.util.List;

public interface FilmService {
    Film getFilmById(Long id);
    List<Film> getAllFilms();
    void addFilm(Film film);
}
