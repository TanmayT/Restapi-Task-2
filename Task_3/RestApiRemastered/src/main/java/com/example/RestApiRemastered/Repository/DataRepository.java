package com.example.RestApiRemastered.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.RestApiRemastered.Model.Data;

public interface DataRepository extends MongoRepository<Data,  Integer> {

public	List <Data> findAllByNameContaining(String name);

}
