package com.alura.java.forumhub.repository;

import com.alura.java.forumhub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Curso findById(long id);

    Optional<Object> findByNome(String nome);
}