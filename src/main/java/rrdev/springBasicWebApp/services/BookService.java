package rrdev.springBasicWebApp.services;

import rrdev.springBasicWebApp.domain.Book;

public interface BookService {
    public Iterable<Book> findAll();
}
