package rrdev.springBasicWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import rrdev.springBasicWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
