package com.atvcrud.farmacia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atvcrud.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	//trazer produtos por id
	public Produto findProdutoById(Long id);
	//trazer produto por nome
	public Optional<Produto> findProdutoByNomeContainingIgnoreCase(String nome);
	//deletar por id
	public Produto deleteProdutoById(Long id);
	
}