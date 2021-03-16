package com.jpa3.jpa3.oneToOne.entites;

import javax.persistence.*;

@Entity
@Table(name = "authorone") //Q6
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;

    @OneToOne(mappedBy = "authorOne")
    private BookOne bookOne;

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

    public BookOne getBookOne() {
        return bookOne;
    }

    public void setBookOne(BookOne bookOne) {
        this.bookOne = bookOne;
    }
}
