package com.redesocial.minhaLojadeGames.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Set;

import com.redesocial.minhaLojadeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo);
	public Set<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}