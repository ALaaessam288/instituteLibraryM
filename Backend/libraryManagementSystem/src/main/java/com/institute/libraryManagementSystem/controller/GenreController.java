package com.institute.libraryManagementSystem.controller;

import com.institute.libraryManagementSystem.model.Genre;
import com.institute.libraryManagementSystem.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {
    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable Long id) {
        return genreService.getGenreById(id);
    }

    @PostMapping
    public void addGenre(@RequestBody Genre genre) {
        genreService.saveGenre(genre);
    }

    @PutMapping("/{id}")
    public void updateGenre(@PathVariable Long id, @RequestBody Genre genre) {
        Genre existingGenre = genreService.getGenreById(id);
        if (existingGenre != null) {
            // Update the genre object with new details
            existingGenre.setName(genre.getName());

            // Save the updated genre to the repository
            genreService.saveGenre(existingGenre);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteGenreById(@PathVariable Long id) {
        genreService.deleteGenreById(id);
    }
}
