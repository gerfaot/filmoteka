package petproject.filmoteka.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import petproject.filmoteka.dao.FilmEntity;
import petproject.filmoteka.dao.FilmRepository;
import petproject.filmoteka.exception.FilmNotFoundException;
import petproject.filmoteka.mapper.FilmToEntityMapper;
import petproject.filmoteka.model.Film;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceClass implements FilmService{
    private final FilmRepository filmRepository;

    private final FilmToEntityMapper mapper;
    @Override
    public Film getFilmById(Long id){
        FilmEntity filmEntity = filmRepository
                .findById(id)
                .orElseThrow(() -> new FilmNotFoundException("Film not found: id = " + id));

        return mapper.filmEntityToFilm(filmEntity);
    }

    @Override
    public List<Film> getAllFilms() {
        Iterable<FilmEntity> iterable = filmRepository.findAll();

        ArrayList<Film> films = new ArrayList<>();
        for (FilmEntity filmEntity : iterable) {
            films.add(mapper.filmEntityToFilm(filmEntity));
        }

        return films;
    }

    @Override
    public void addFilm(Film film) {
        FilmEntity filmEntity = mapper.filmToFilmEntity(film);
        filmRepository.save(filmEntity);
    }
}
