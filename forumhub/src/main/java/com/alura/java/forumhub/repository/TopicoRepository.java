package com.alura.java.forumhub.repository;

import com.alura.java.forumhub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findAllByAutorId(Long autor_id);

    Topico findByTitulo(String titulo);

}