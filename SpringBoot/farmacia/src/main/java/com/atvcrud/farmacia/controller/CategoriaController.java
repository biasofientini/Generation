package com.atvcrud.farmacia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.atvcrud.farmacia.model.Categoria;
import com.atvcrud.farmacia.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	public CategoriaService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Categoria>> getCategoria(){
		return new ResponseEntity<List<Categoria>>(service.pegarCategoria(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long id){
		return new ResponseEntity<Categoria>(service.pegarCategoriaId(id), HttpStatus.OK);
	}
	
	@GetMapping("/description")
	public ResponseEntity<Optional<Categoria>> getCategoriaByDescricao(@RequestBody String descricao){
		return new ResponseEntity<Optional<Categoria>>(service.pegarCategoriaDescricao(descricao), HttpStatus.OK);
	}
	
	@PostMapping("/new")
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria){
		return new ResponseEntity<Categoria>(service.inserirCategoria(categoria), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria categoria){
		return new ResponseEntity<Categoria>(service.atualizarCategoria(categoria), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Categoria> deleteCategoria(@PathVariable Long id){
		return new ResponseEntity<Categoria>(service.deletarProduto(id), HttpStatus.ACCEPTED);
	}
	
}
