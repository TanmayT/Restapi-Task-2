# Rest Api and Mongo containerization

Running seperate independent containers for api and mongodb via docker-compose

# Requirements
  - Java
  - Docker compose
  - Mongodb

# DockerFiles:

  - DOCKERFILEMONGO => mongo container docker file
  - DOCKERFILERESTAPI => docker file for restapi container
  - Both containers can be run seperately and linked together by using docker run command with --link argument. The Implementation part of this documentation focuses on running both containers together via docker-compose.
  
# Implementation

- Clone the repository onto your system
- Navigate into the Restapi-Task-3/Task_3/RestApiRemastered/ and open terminal in that directory
- Run the following command to start the api and mongo containers
```sh
$ sudo docker-compose up --build
```
- To bring down the containers issue the following command
```sh
$ sudo docker-compose down
```
# Points to note
- Persistant database is stored at database/ folder inside the RestApiRemastered folder.
- Queries to be made at localhost port 8080
