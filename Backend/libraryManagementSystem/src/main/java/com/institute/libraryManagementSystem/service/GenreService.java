package com.institute.libraryManagementSystem.service;

import com.institute.libraryManagementSystem.model.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> getAllGenres();

    Genre getGenreById(Long id);

    void saveGenre(Genre genre);

    void deleteGenreById(Long id);

    // Other service methods related to genres
}
