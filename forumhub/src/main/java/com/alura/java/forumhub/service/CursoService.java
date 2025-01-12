package com.alura.java.forumhub.service;

import com.alura.java.forumhub.model.Curso;
import com.alura.java.forumhub.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Page<Curso> listarCursos(Pageable paginacao) {
        return cursoRepository.findAll(paginacao);
    }

    public Optional<Curso> buscarCursoPorId(Long cursoId) {
        return cursoRepository.findById(cursoId);
    }

    public Optional<Object> buscarCursoPorNome(String nome) {
        return cursoRepository.findByNome(nome);
    }

    public void excluirCurso(Long id) {
        cursoRepository.deleteById(id);
    }

}