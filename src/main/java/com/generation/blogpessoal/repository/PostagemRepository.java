package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

<<<<<<< HEAD

=======
@Repository
>>>>>>> 747edc1be38d070294b311936ebf51ade2515650
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
	
	//SELECT * FROM tb_postagem WHERE titulo Like "%???%";
}
