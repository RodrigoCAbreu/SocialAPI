package com.example.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {
	
}
