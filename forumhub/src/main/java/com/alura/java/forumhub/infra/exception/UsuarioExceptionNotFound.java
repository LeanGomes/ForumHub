package com.alura.java.forumhub.infra.exception;


public class UsuarioExceptionNotFound extends RuntimeException {
    public UsuarioExceptionNotFound(String mensagem) {
        super(mensagem);
    }
    public UsuarioExceptionNotFound(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}