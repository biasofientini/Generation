package com.helloworld.Introducao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {
	
	@RequestMapping("/mentalidades")
		@GetMapping
		public String mentalidadeEHabilidade() {
			return "Mentalidades e habilidades: persistência, proatividade, orientação ao futuro e mentalidade de crescimento";
		}
	
	@RequestMapping(value = "/objetivos")
		@GetMapping
		public String objetivo() {
			return "Objetivo de aprendizagem: Aprimorar conhecimentos com o framework Spring Boot";
		}
}
