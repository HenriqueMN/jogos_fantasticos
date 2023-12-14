package com.generation.jogosfantasticos.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório.")
	@Size(min = 5, max = 100, message = "O nome deve ter entre 5 e 100 caracteres.")
	@Column(length = 100)
	String nome;
	
	@NotBlank(message = "A descrição do produto é obrigatória.")
	@Size(max = 1000, message = "A descrição pode ter no máximo 1000 caracteres.")
	@Column(length = 1000)
	String descricao;
	
	@NotNull(message = "O preço do produto é obrigatório.")
	@Column(precision = 8, scale = 2) //= DECIMAL(8,2)
	BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
