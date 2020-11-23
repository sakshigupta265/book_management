# API DOCUMENTATION

## Author 
* addAuthor: used to create new author

PATH | MAPPING | BODY: raw-JSON 
-----------------------------------------
http://localhost:8080/addAuthor | POST | {
        "name": "J.K Rowling",
   “email_id”:”jkrowling@writers.com”
}



* getAuthor/{author_id}: used to retrieve author details by using author id



