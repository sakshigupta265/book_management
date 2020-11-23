 # Book Management 
A [Spring Boot Application](https://spring.io/guides/gs/spring-boot/) that uses [Hibernate](https://www.tutorialspoint.com/hibernate/index.htm), [JPA](https://www.tutorialspoint.com/jpa/index.htm), [RESTful API's](https://restfulapi.net/) for data management. In this project the contents of a Database 'library' containing two tables 'book' and 'author' are managed.

## Overview of book and author tables
__[Author](https://github.com/sakshigupta265/book_management/blob/master/Author%20Table.md)__

![author db](https://user-images.githubusercontent.com/54631569/99930985-f4201200-2d78-11eb-93d7-b52c0f9162f0.jpg)

__[Book](https://github.com/sakshigupta265/book_management/blob/master/Book%20Documentation.md)__

![book db](https://user-images.githubusercontent.com/54631569/99931010-07cb7880-2d79-11eb-8036-6d2c87ab5ef1.jpg)

for the sql script please go through: [library script](https://github.com/sakshigupta265/book_management/blob/master/library.sql)

_* : primary key_

_^ : foreign key_ 

## Structure of Maven Project

![structure](https://user-images.githubusercontent.com/54631569/99932793-246aaf00-2d7f-11eb-88b7-9d8588a5e966.jpg)

Run [Main.java](https://github.com/sakshigupta265/book_management/blob/master/src/main/java/com/java/Main.java) file to start the application.

![main](https://user-images.githubusercontent.com/54631569/99936092-503e6280-2d88-11eb-89c5-b4ad6caeac88.jpg)

![springboot](https://user-images.githubusercontent.com/54631569/99936123-62b89c00-2d88-11eb-8a9b-37d8dfcbdf74.jpg)

After the application has succesfully started, open an API client (like I used [Postman](https://www.postman.com/) here) to make API calls and interact with the application.

![postman](https://user-images.githubusercontent.com/54631569/99936290-ccd14100-2d88-11eb-8fb5-357c2de74f0b.jpg)

__[Jump to Code](https://github.com/sakshigupta265/book_management/tree/master/src/main/java/com/java)__

## Documentation
For more information about the working of project please go through [Author Documentation](https://github.com/sakshigupta265/book_management/blob/master/Author%20Documentation.md) and [Book Documentation](https://github.com/sakshigupta265/book_management/blob/master/Book%20Documentation.md)
