package com.redesocial.minhaLojadeGames.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redesocial.minhaLojadeGames.model.Categoria;
import com.redesocial.minhaLojadeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/titulos")
	public ResponseEntity<List<Categoria>> pegarCategoriaTitulo(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(categoria.getTitulo()));
	}
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/id}")
	public ResponseEntity<Categoria> getId(@RequestBody Categoria categoria) {
		return repository.findById(categoria.getId())
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/descricao")
	public ResponseEntity<Set<Categoria>> getDescricao(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(categoria.getDescricao()));
	}
	@PostMapping("/nova")
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria){
		return ResponseEntity.status(201).body(repository.save(categoria));
	}
	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria){
		return ResponseEntity.status(200).body(repository.save(categoria));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
