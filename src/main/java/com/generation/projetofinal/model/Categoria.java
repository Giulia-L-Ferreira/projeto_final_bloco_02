package com.generation.projetofinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome da categoria é obrigatório")
	@Size(min = 5, max = 100, message = "minimo 5 caracteres - máximo 100 caracteres")
	private String nomeCategoria;
	
	@NotBlank(message = "Descrição obrigatória")
	private String descricaoCategoria;

}
