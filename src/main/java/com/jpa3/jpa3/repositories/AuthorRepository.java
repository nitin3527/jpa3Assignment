package com.jpa3.jpa3.repositories;

import com.jpa3.jpa3.entites.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
