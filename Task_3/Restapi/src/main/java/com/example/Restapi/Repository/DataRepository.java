package com.example.Restapi.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Restapi.Model.Data;

public interface DataRepository extends MongoRepository<Data,  Integer> {

public	List <Data> findAllByNameContaining(String name);

}
