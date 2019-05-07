package com.example.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
