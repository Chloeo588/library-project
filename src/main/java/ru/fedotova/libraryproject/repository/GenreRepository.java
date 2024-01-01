package ru.fedotova.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fedotova.libraryproject.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
