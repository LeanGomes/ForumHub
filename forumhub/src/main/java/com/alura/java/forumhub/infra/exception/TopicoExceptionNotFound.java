package com.alura.java.forumhub.infra.exception;


public class TopicoExceptionNotFound extends RuntimeException {
    public TopicoExceptionNotFound(String mensagem) {
        super(mensagem);
    }
    public TopicoExceptionNotFound(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}