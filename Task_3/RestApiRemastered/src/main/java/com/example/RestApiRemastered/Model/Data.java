package com.example.RestApiRemastered.Model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Data")
public class Data {
	@org.springframework.data.annotation.Id
	private int id; // Analogous to primary key in a relational database 
	@Indexed(unique = false)  // so as to specify that these may have duplicate values
	private String name;
	@Indexed(unique = false)
	private String language;
	@Indexed(unique = false)
	private String framework;

	
}
