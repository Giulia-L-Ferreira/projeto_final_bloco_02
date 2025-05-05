package com.generation.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.projetofinal.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Object findAllByNomeprodutoContainingIgnoreCase(String nomejogo);
}
