# API DOCUMENTATION

## Author 
* addAuthor: used to create new author

PATH | MAPPING | BODY: raw-JSON 
-----|---------|----------------
http://localhost:8080/addAuthor | POST | { "name": "J.K Rowling" , “email_id”:”jkrowling@writers.com" }


* getAuthor/{author_id}: used to retrieve author details by using author id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getAuthorById/{author_id} | GET | 

    _replace {author_id} by an integer value_
    
* getAllAuthors: used to retrieve details of authors

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/getAllAuthors | GET | 


* updateAuthor: used to update details of author

PATH | MAPPING | BODY: raw-JSON
http://localhost:8080/updateAuthor | PUT | { "author_id": 8, "name": "Jerome K Jerome", "email_id": "jkj@writer.com" }


* deleteAutho/{author_id}: used to delete details of author by author_id

PATH | MAPPING | BODY: not required 
-----|---------|----------------
http://localhost:8080/deleteAuthor | DELETE | 

    _replace {author_id} by an integer value_
