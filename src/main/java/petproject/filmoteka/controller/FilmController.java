package petproject.filmoteka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import petproject.filmoteka.mapper.FilmRequestToFilm;
import petproject.filmoteka.model.Film;
import petproject.filmoteka.model.FilmRequest;
import petproject.filmoteka.service.FilmService;

import java.util.List;

@RestController()
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {
    private final FilmService filmService;

    private final FilmRequestToFilm mapper;

    @GetMapping("/{id}")
    public Film getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }


    @PostMapping
    public void addFilm(@RequestBody FilmRequest request) {
        filmService.addFilm(mapper.AddFilmRequestToFilm(request));
    }

}
