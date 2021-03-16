create database jpa3;
use jpa3;
show tables;
/*========================== one to Many =======================*/
create table author(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20),
streetnum varchar(20),
location varchar(20),
state varchar(20)
);

create table subject(
id int PRIMARY KEY AUTO_INCREMENT,
author_id int,
name varchar(20),
description varchar(50),
 FOREIGN KEY (author_id)
REFERENCES author(id)
);

create table book(
id int PRIMARY KEY AUTO_INCREMENT,
author_id int,
bookName varchar(20),
 FOREIGN KEY (author_id)
REFERENCES author(id)
);

/*========================== Many to Many =======================*/
create table authormany(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
);

create table bookmany(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
);

create table manytomany(
author_id int,
book_id int,
FOREIGN KEY (author_id)
REFERENCES authormany(id),
FOREIGN KEY (book_id)
REFERENCES bookmany(id)
);
/*===================== ONE to One =====================================*/
create table authorone(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
)

create table bookone(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20),

author_id int,
FOREIGN KEY (author_id)
REFERENCES authorone(id)
)


select * from authormany;
select * from bookmany;
select * from manytomany;
select * from subject;
drop table book;
drop table subject;
drop table author;
