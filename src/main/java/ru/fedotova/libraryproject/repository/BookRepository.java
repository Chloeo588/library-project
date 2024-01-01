package ru.fedotova.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fedotova.libraryproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
