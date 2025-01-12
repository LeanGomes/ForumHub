package com.alura.java.forumhub.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RespostaDto(@NotBlank
                          String mensagem,
                          @NotNull
                          Long autor_id,
                          Long topico_id) {
}
