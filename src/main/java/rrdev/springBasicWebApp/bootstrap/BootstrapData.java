package rrdev.springBasicWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rrdev.springBasicWebApp.domain.Author;
import rrdev.springBasicWebApp.domain.Book;
import rrdev.springBasicWebApp.domain.Publisher;
import rrdev.springBasicWebApp.repositories.AuthorRepository;
import rrdev.springBasicWebApp.repositories.BookRepository;
import rrdev.springBasicWebApp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author();
        a1.setFirstName("Rodrigo");
        a1.setLastName("Rebolledo");

        Author authorSaved1 = authorRepository.save(a1);

        Book b1 = new Book();
        b1.setTitle("Aprendiendo Java y Spring Boot");
        b1.setIsbn("12345");

        Book bookSaved1 = bookRepository.save(b1);

        Publisher p1 = new Publisher();
        p1.setName("El Pepe");
        p1.setCity("Concepción");
        p1.setAddress("Para que quieres saber eso jaja saludos");
        p1.setZip("#1234");
        p1.setState("BioBio");
        p1.getBooks().add(bookSaved1);

        Publisher publisherSaved1 = publisherRepository.save(p1);

        authorSaved1.getBooks().add(bookSaved1);
        bookSaved1.getAuthors().add(authorSaved1);
        bookSaved1.setPublisher(publisherSaved1);
        authorRepository.save(authorSaved1);
        bookRepository.save(bookSaved1);

        System.out.println("Bootstrap in");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }

}
