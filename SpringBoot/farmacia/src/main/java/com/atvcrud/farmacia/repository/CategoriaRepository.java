package com.atvcrud.farmacia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atvcrud.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	//trazer categoria por id
	public Categoria findCategoriaById(Long id);
	//trazer categoria por descricao
	public Optional<Categoria> findCategoriaByDescricaoContainingIgnoreCase(String descricao);
	public Categoria deleteCategoriaById(Long id);
	
}