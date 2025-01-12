package com.alura.java.forumhub.dto;

import com.alura.java.forumhub.model.Resposta;
import com.alura.java.forumhub.model.Topico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TopicoResponse {
    Long id;
    String titulo;
    String mensagem;
    String status;
    String dataCriacao;
    String nomeCurso;
    String nomeAutor;
    Long idAutor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    List<RespostaResponse> respostas;
    @JsonIgnore
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public List<RespostaResponse> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<RespostaResponse> respostas) {
        this.respostas = respostas;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public static List<TopicoResponse> converter(List<Topico> topicos) {
        List<TopicoResponse> topicoResponses = new ArrayList<>();
        for (Topico topico : topicos) {
            topicoResponses.add(new TopicoResponse(topico, false));
        }
        return topicoResponses;
    }

    private List<RespostaResponse> addRespostas(List<Resposta> respostas) {
        List<RespostaResponse> respostaResponses = new ArrayList<>();
        for (Resposta resposta : respostas) {
            respostaResponses.add(new RespostaResponse(resposta, false));
        }
        if (respostaResponses.isEmpty()) {
            return null;
        }
        return respostaResponses;
    }

    public TopicoResponse(Topico topico, Boolean respostas) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.status = topico.getStatus().toString();
        this.dataCriacao = topico.getDataCriacao().format(formatter);
        this.nomeCurso = topico.getCurso().getNome();
        this.nomeAutor = topico.getAutor().getNome();
        this.idAutor = topico.getAutor().getId();
        if (respostas){
            this.respostas = addRespostas(topico.getRespostas());
        } else {
            this.respostas = null;
        }
    }
}
