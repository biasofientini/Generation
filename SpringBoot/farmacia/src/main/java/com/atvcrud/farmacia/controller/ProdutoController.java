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

import com.atvcrud.farmacia.model.Produto;
import com.atvcrud.farmacia.service.ProdutoService;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	public ProdutoService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Produto>> getProduto(){
		return new ResponseEntity<List<Produto>>(service.pegarProduto(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getProdutoById(@PathVariable Long id){
		return new ResponseEntity<Produto>(service.pegarProdutoId(id), HttpStatus.OK);
	}
	
	@GetMapping("/name")
	public ResponseEntity<Optional<Produto>> getProdutoByNome(@RequestBody String nome){
		return new ResponseEntity<Optional<Produto>>(service.pegarProdutoNome(nome), HttpStatus.OK);
	}
	
	@PostMapping("/new")
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
		return new ResponseEntity<Produto>(service.inserirProduto(produto), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Produto> putProduto(@RequestBody Produto produto){
		return new ResponseEntity<Produto>(service.atualizarProduto(produto), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Produto> deleteProduto(@PathVariable Long id){
		return new ResponseEntity<Produto>(service.deletarProduto(id), HttpStatus.ACCEPTED);
	}
	
}