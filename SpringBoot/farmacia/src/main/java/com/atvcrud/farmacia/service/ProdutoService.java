package com.atvcrud.farmacia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atvcrud.farmacia.model.Produto;
import com.atvcrud.farmacia.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	public ProdutoRepository repository;
	
	// trazer todas os produtos
	public List<Produto> pegarProduto(){
		return repository.findAll();
	}
	
	//trazer um produto por id
	public Produto pegarProdutoId(Long id) {
		return repository.findProdutoById(id);
	}
	
	//trazer produto por nome
	public Optional<Produto> pegarProdutoNome(String nome) {
		Optional<Produto> produtoExistente = repository.findProdutoByNomeContainingIgnoreCase(nome);
		if(produtoExistente.isPresent()) {
			return repository.findProdutoByNomeContainingIgnoreCase(nome);
		} 
		return null;
	}
	
	//criar novo produto
	public Produto inserirProduto(Produto produto) {
		Optional<Produto> produtoExistente = repository.findProdutoByNomeContainingIgnoreCase(produto.getNome());
		if(!produtoExistente.isPresent()) {
			return repository.save(produto);
		}
		return null;
	}
	
	//atualizar produto
	public Produto atualizarProduto(Produto produto) {
		Optional<Produto> produtoExistente = repository.findById(produto.getId());
		if(produtoExistente.isPresent()) {
			return repository.save(produto);
		}
		return null;
	}
	
	//deletar produto
	public Produto deletarProduto(Long id) {
		Optional<Produto> produtoExistente = repository.findById(id);
		if(produtoExistente.isPresent()) {
			return repository.deleteProdutoById(id);
		}
		return null;
	}
	
}
