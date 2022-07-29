package com.barisuygn.todobackend;
import java.util.UUID;
import java.util.ArrayList;  
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static ArrayList<Todo> todoList = new ArrayList<Todo>();  

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getTodo")
	public ArrayList<Todo> getTodo() {
		return todoList;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/addTodo")
	public boolean addTodo() {
		UUID uuid = UUID.randomUUID();
		todoList.add(new Todo(uuid.toString(),"","",""));
		return true;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/refreshTodos")
	public boolean refreshTodos(@RequestBody ArrayList<Todo> reqParam) {
		todoList = reqParam;
		return true;
	}
}