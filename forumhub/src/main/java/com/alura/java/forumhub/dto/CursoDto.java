package com.alura.java.forumhub.dto;

import jakarta.validation.constraints.NotBlank;

public record CursoDto(@NotBlank
                        String nome,
                       @NotBlank
                        String categoria){
}
