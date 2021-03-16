package com.jpa3.jpa3.manyToMany.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authormany") //Q8
public class AuthorMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(name = "manytomany",
    joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    private List<BookMany> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<BookMany> books) {
        this.books = books;
    }
}
