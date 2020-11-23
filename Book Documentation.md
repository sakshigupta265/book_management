# API DOCUMENTATION

## Book 
* addBook: used to create new book

PATH | MAPPING | BODY: raw-JSON 
-----|---------|----------------
http://localhost:8080/addBook | POST | { "title": "Harry Potter and The Order Of Phoenix" , "description": "Fantasy" , "published": "2003-06-21" ,  "author": { "author_id": 3 } }

![addBook](https://user-images.githubusercontent.com/54631569/99940662-a31d1780-2d92-11eb-806d-604b6a4c6cb1.jpg)

* getBook/{book_id}: used to retrieve book details by using book id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getBookById/{book_id} | GET | 

    replace {book_id} by an integer value

![getBookById](https://user-images.githubusercontent.com/54631569/99940727-c2b44000-2d92-11eb-972e-2e0997da24c3.jpg)

* groupByAuthorId/{author_id}: used to group books with same author id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/groupByAuthorId/{author_id} | GET | 

    replace {author_id} by an integer value

![groupBookByAuthorId](https://user-images.githubusercontent.com/54631569/99940767-d790d380-2d92-11eb-8cea-e6cf77977d6d.jpg)

* groupByAuthorName/{author_name}: used to group books with same author name

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/groupByAuthorName/{author_name} | GET | 

    replace {author_name} by a string value

![groupByAuthorName](https://user-images.githubusercontent.com/54631569/99940790-e4adc280-2d92-11eb-953b-82f23cb906a3.jpg)

* groupByBookDescription/{description}: used to group books with same description/genre

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/groupByBookDescription/{description} | GET | 

    replace {description} by an integer value

![groupBookByDescription](https://user-images.githubusercontent.com/54631569/99941096-6dc4f980-2d93-11eb-8788-a3fc70db715c.jpg)

* getAllBooks: used to retrieve details of all book

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getAllBooks | GET | 

![getAllBooks](https://user-images.githubusercontent.com/54631569/99941163-8e8d4f00-2d93-11eb-92e1-1633394e9177.jpg)

* updateBook: used to update details of book

PATH | MAPPING | BODY: raw-JSON
-----|---------|----------------
http://localhost:8080/updateBook | PUT | { "book_id": 6 , "title": "Harry Poter and The Half Blood Prince" , "description": "Fantasy" , "published": "2005-07-16T00:00:00.000+0000" , "author": { "author_id": 3 , "name": "J.K Rowling" , "email_id": jkrowling123@writers.com } }

![updatBook](https://user-images.githubusercontent.com/54631569/99941251-b8467600-2d93-11eb-879b-db9973734905.jpg)

* deleteBook/{book_id}: used to delete details of book by book_id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/deleteBook | DELETE | 

    replace {book_id} by an integer value
![deleteBook](https://user-images.githubusercontent.com/54631569/99941305-d0b69080-2d93-11eb-990e-b15f457d4c3c.jpg)

