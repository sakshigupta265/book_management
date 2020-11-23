create database library;
use library;


create table author(
author_id int not null primary key auto_increment,
name char(255) not null,
email_id char(255)
)ENGINE=INNODB;


create table book(
book_id int not null primary key auto_increment,
title char(255) not null,
description char(255) not null,
published char(255) not null,
author_id int not null,

foreign key (author_id)
references author(author_id)
)ENGINE=INNODB;


select * from author;
select * from book;

drop database library;