package com.atvcrud.farmacia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atvcrud.farmacia.model.Categoria;
import com.atvcrud.farmacia.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository repository;
	
	//trazer todas as categorias
	public List<Categoria> pegarCategoria(){
		return repository.findAll();
	}
	
	//trazer categoria por id
	public Categoria pegarCategoriaId(Long id) {
		return repository.findCategoriaById(id);
	}
	
	//trazer categoria por descricao
	public Optional<Categoria> pegarCategoriaDescricao(String descricao){
		Optional<Categoria> categoriaExistente = repository.findCategoriaByDescricaoContainingIgnoreCase(descricao);
		if(categoriaExistente.isPresent()) {
			return repository.findCategoriaByDescricaoContainingIgnoreCase(descricao);
		}
		return null;
	}
	
	//nova categoria
	public Categoria inserirCategoria(Categoria categoria) {
		return repository.save(categoria);
	}
	
	//atualizar categoria
	public Categoria atualizarCategoria(Categoria categoria) {
		Optional<Categoria> categoriaExistente = repository.findById(categoria.getId());
		if(categoriaExistente.isPresent()) {
			return repository.save(categoria);
		}
		return null;
	}
	
	//deletar categoria
	public Categoria deletarProduto(Long id) {
		Optional<Categoria> categoriaExistente = repository.findById(id);
		if(categoriaExistente.isPresent()) {
			return repository.deleteCategoriaById(id);
		}
		return null;
	}
	
}
