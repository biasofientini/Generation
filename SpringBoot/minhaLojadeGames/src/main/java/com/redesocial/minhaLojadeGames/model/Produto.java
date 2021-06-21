package com.redesocial.minhaLojadeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 65, message = "Error size nome")
	private String nome;
	
	@NotNull
	@Size(min = 2, max = 15, message = "Error size preco")
	private String preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	//Categoria
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	//Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	//Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//Preco
	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
}