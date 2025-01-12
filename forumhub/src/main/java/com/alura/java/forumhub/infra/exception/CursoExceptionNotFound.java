package com.alura.java.forumhub.infra.exception;


public class CursoExceptionNotFound extends RuntimeException {
    public CursoExceptionNotFound(String mensagem) {
        super(mensagem);
    }
    public CursoExceptionNotFound(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}