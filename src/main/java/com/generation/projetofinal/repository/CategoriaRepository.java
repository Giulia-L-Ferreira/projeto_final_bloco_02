package com.generation.projetofinal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.projetofinal.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	Object findAllByNomecategoriaContainingIgnoreCase(String nomecategoria);


}