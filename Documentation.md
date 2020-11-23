# API DOCUMENTATION

## Author 
* addAuthor: used to create new author

PATH | MAPPING | BODY: raw-JSON 
-----|---------|----------------
http://localhost:8080/addAuthor | POST | { "name": "J.K Rowling" , “email_id”:”jkrowling@writers.com" }

![addAuthor](https://user-images.githubusercontent.com/54631569/99939245-a531a700-2d8f-11eb-8678-71aa53bb5445.jpg)

* getAuthor/{author_id}: used to retrieve author details by using author id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getAuthorById/{author_id} | GET | 

    replace {author_id} by an integer value

![getAuthorById](https://user-images.githubusercontent.com/54631569/99939276-b975a400-2d8f-11eb-905b-bdefb8438c23.jpg)

* getAllAuthors: used to retrieve details of authors

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getAllAuthors | GET | 

![getAllAuthors](https://user-images.githubusercontent.com/54631569/99939332-d3af8200-2d8f-11eb-9a1a-68bb1b52aa0f.jpg)

* updateAuthor: used to update details of author

PATH | MAPPING | BODY: raw-JSON
-----|---------|----------------
http://localhost:8080/updateAuthor | PUT | { "author_id": 8, "name": "Jerome K Jerome", "email_id": "jkj@writer.com" }

![updateAuthor](https://user-images.githubusercontent.com/54631569/99939431-09546b00-2d90-11eb-98d1-430200f7074d.jpg)

* deleteAutho/{author_id}: used to delete details of author by author_id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/deleteAuthor | DELETE | 

    replace {author_id} by an integer value

![deleteAuthor](https://user-images.githubusercontent.com/54631569/99939465-1e30fe80-2d90-11eb-9e4a-9563055ab2e4.jpg)
