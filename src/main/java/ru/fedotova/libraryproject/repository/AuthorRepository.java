package ru.fedotova.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fedotova.libraryproject.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
