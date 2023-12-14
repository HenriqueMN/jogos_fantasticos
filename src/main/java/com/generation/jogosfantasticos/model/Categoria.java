package com.generation.jogosfantasticos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "É obrigatório escrever um nome para a categoria")
	@Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
	@Column(length = 100)
	private String nome;

	@NotBlank(message = "É obrigatório escrever uma decrição para a categoria")
	@Size(min = 20, max = 250, message = "A descrição deve ter entre 20 e 250 caracteres.")
	@Column(length = 250)
	private String descricao;

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

}
