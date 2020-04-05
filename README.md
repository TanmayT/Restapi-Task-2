# Simple Rest API

A simple rest api implemented in java along with spring boot, mongodb and docker for containerization . 

# Requirements
  - Java
  - Docker
  - Mongodb

# Endpoint names:

  - PUT/ => for pushing a server as a mongodb document into the database
  - GET/ => retrieve all documents from collection in database
  - GET/{id} => retrieve document with id specified in field from database
  - GETBYNAME/{specify-substring-to-be-searched} => all such documents containing the specified string as a substring in their name field are returned.
  - DELETE/{id} => delete the document from database with specified id
  
# Sample input JSON
```sh
{
	"id" : 4,
	"name" : "dummy",
	"language" : "python",
	"framework" : "keras"
}
```
# Implementation

  - Clone the repository onto your system
  - Open a new terminal window to run mongod with path to the db folder
Example
```sh
$ mongod --dbpath /var/lib/mongodb/data/db/
```
- Navigate into the Restapi-Task-1/Task_1/Restapi/ and open terminal in that directory
- Run the following command to start the restapi on port 8080 at localhost
```sh
$ mvn spring-boot:run
```

