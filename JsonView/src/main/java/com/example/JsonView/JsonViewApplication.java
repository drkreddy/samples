package com.example.JsonView;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JsonViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonViewApplication.class, args);
	}
}

@RestController
class Controller{

	@GetMapping("/abc")
	public String get(){
		return "adfad";
	}

	@JsonView(View.A.class)
	@PostMapping("/apo")
	public ResponseEntity<User> post(@RequestBody User user){
		return ResponseEntity.ok(user);
	}

}
class View {
	public interface A {}
	public interface B extends A {}
	public interface C extends B {}
}

class User{
	@JsonView(View.A.class)
	Integer id;
	@JsonView(View.B.class)
	String firstName;
	@JsonView(View.C.class)
	String lastName;
}