package rrdev.springBasicWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import rrdev.springBasicWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
