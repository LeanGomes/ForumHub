package com.alura.java.forumhub.infra.auth;

import com.alura.java.forumhub.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


    @Service
    public class AutenticacaoService implements UserDetailsService {

        @Autowired
        private UsuarioRepository repository;
        @Override
        public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
            System.out.println("Login do usuario: " + nome);
            return repository.findByNome(nome);
        }
    }

