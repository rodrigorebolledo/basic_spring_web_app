package rrdev.springBasicWebApp.services;

import rrdev.springBasicWebApp.domain.Author;

public interface AuthorService {
    public Iterable<Author> findAll();
}
