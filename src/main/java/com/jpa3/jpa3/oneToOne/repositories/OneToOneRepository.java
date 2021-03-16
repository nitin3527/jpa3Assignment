package com.jpa3.jpa3.oneToOne.repositories;

import com.jpa3.jpa3.oneToOne.entites.BookOne;
import org.springframework.data.repository.CrudRepository;

public interface OneToOneRepository extends CrudRepository<BookOne, Integer> {
}
