package com.jpa3.jpa3.manyToMany.repositories;

import com.jpa3.jpa3.manyToMany.entites.AuthorMany;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorMany, Integer> {
}
