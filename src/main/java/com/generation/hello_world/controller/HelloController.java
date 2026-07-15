package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
@GetMapping
public String helloWorld() {
	return "Hello World!";
}

@GetMapping("/turma")
public String turmaJava85() {
	return "<b>A Turma Java 85 é TOP!";
}

}
