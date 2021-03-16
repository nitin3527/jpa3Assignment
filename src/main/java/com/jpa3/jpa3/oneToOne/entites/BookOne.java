package com.jpa3.jpa3.oneToOne.entites;

import javax.persistence.*;

@Entity
@Table(name = "bookone")
public class BookOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorOne authorOne;

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

    public AuthorOne getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(AuthorOne authorOne) {
        this.authorOne = authorOne;
    }
}
