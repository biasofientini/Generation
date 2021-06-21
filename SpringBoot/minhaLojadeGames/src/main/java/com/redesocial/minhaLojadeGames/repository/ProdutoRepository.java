package com.redesocial.minhaLojadeGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesocial.minhaLojadeGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public Optional<Produto> findByNome(String nome);
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
}