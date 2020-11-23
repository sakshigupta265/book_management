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
