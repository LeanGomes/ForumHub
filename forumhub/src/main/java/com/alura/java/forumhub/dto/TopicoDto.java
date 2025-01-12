package com.alura.java.forumhub.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicoDto(@NotBlank
                        String titulo,
                        @NotBlank
                        String mensagem,
                        @NotNull
                        Long autorId,
                        @NotNull
                        Long cursoId) {
}
