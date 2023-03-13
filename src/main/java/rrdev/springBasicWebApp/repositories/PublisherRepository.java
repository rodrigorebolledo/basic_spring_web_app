package rrdev.springBasicWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import rrdev.springBasicWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
