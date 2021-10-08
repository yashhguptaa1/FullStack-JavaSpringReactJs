package com.example.petclinic.repositories;

import com.example.petclinic.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}