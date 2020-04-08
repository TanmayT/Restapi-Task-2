package com.example.RestApiRemastered.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiRemastered.Model.Data;
import com.example.RestApiRemastered.Repository.DataRepository;

@RestController
public class DataController {
	
	@Autowired
	private DataRepository repository;

	@PostMapping("/PUT")
	public String saveData(@RequestBody Data data) {
		repository.save(data);
		return "Added Data with id: " + data.getId() ;
	}

	@GetMapping("/GET")
	public List<Data> getData() {
		
		return repository.findAll();
	}

	@GetMapping("/GET/{id}")
	public Optional<Data> getData(@PathVariable int id){
		
		return repository.findById(id);
	}
 
	@DeleteMapping("/DELETE/{id}")
	public String deleteData(@PathVariable int id) {
		repository.deleteById(id);
		return "data deleted with id : " + id;
	
	}
	
	@RequestMapping("/GETBYNAME/{name}")
	public List  <Data> findAllByNameContaining(@PathVariable(value="name") String name) {
		return repository.findAllByNameContaining(name);
	}

}


