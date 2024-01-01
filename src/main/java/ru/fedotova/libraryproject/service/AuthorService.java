package ru.fedotova.libraryproject.service;

import ru.fedotova.libraryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
}
