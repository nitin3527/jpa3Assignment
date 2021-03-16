package com.jpa3.jpa3;

import com.jpa3.jpa3.entites.Address;
import com.jpa3.jpa3.entites.Author;
import com.jpa3.jpa3.entites.Book;
import com.jpa3.jpa3.entites.Subject;
import com.jpa3.jpa3.manyToMany.entites.AuthorMany;
import com.jpa3.jpa3.manyToMany.entites.BookMany;
import com.jpa3.jpa3.manyToMany.repositories.ManyToManyRepository;
import com.jpa3.jpa3.oneToOne.entites.AuthorOne;
import com.jpa3.jpa3.oneToOne.entites.BookOne;
import com.jpa3.jpa3.oneToOne.repositories.OneToOneRepository;
import com.jpa3.jpa3.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Jpa3ApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	ManyToManyRepository manyToManyRepository;

	@Autowired
	OneToOneRepository oneToOneRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testCreateAuthor(){
		Author auth = new Author();
		auth.setName("Dan Brown");
		Address address = new Address();
		address.setLocation("USA");
		address.setState("New york");
		address.setStreetnum("66");
		auth.setAddress(address);

		List<Book> books = new ArrayList<Book>();

		Book book1 = new Book();
		book1.setBookName("harry potter");
		book1.setAuthor(auth);
		books.add(book1);


		Book book2 = new Book();
		book2.setBookName("champak");
		book2.setAuthor(auth);
		books.add(book2);

		auth.setBooks(books);

		List<Subject> subjects = new ArrayList<Subject>();
		Subject subject1 = new Subject();
		subject1.setName("horror");
		subject1.setDescription("this is a Horror subject");
		subject1.setAuthor(auth);
		subjects.add(subject1);

		Subject subject2 = new Subject();
		subject2.setName("horror");
		subject2.setDescription("this is a Horror subject");
		subject2.setAuthor(auth);
		subjects.add(subject2);

		auth.setSubjects(subjects);
		authorRepository.save(auth);
	}

	@Test
	void testManyToManyByCreatingData(){
		AuthorMany auth = new AuthorMany();
		auth.setName("Nitin");
		List<BookMany> bookManyList = new ArrayList<BookMany>();

		BookMany bookMany = new BookMany();
		bookMany.setBookName("TTN");
		bookManyList.add(bookMany);

		auth.setBooks(bookManyList);
		manyToManyRepository.save(auth);
	}

	@Test
	void testOneToOneByCreatingData(){
		BookOne bookOne = new BookOne();
		bookOne.setName("harry potter");

		AuthorOne authorOne = new AuthorOne();
		authorOne.setName("jk rolling");
		bookOne.setAuthorOne(authorOne);

		oneToOneRepository.save(bookOne);
	}


}
