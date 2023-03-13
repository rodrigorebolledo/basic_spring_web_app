package rrdev.springBasicWebApp.services;

import org.springframework.stereotype.Service;

import rrdev.springBasicWebApp.domain.Book;
import rrdev.springBasicWebApp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return this.bookRepository.findAll();
    }
}
