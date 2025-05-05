package com.generation.projetofinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório")
	@Size(min = 3, max = 100, message = "minimo 3 caracteres - máximo 100 caracteres")
	private String nomeProduto;
	
	@NotBlank(message = "marca é obrigatório")
	@Size(min = 2, max = 100, message = "minimo 2 caracteres - máximo 100 caracteres")
	private String marca;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Validade é obrigatório")
	private LocalDate dataValidade;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "Preço obrigatório")
	@Positive(message = "O preço precisa ser maior que zero!")
	private BigDecimal preco;
	
	@NotBlank(message = "Descrição obrigatória")
	private String descricaoPorduto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricaoPorduto() {
		return descricaoPorduto;
	}

	public void setDescricaoPorduto(String descricaoPorduto) {
		this.descricaoPorduto = descricaoPorduto;
	}
	
	
}
