# API DOCUMENTATION

## Author 
* addAuthor: used to create new author

PATH: http://localhost:8080/addAuthor
-----------------------------
BODY: raw-JSON 
{
        "name": "J.K Rowling",
   “email_id”:”jkrowling@writers.com”
} 
-----------------------------
MAPPING: POST

* getAuthor/{author_id}: used to retrieve author details by using author id

PATH: http://localhost:8080/getAuthor/{author_id}
-----------------------------
BODY: Not Required
-----------------------------
MAPPING: GET

