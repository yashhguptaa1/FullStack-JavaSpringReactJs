package com.example.petclinic.repositories;

import com.example.petclinic.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}