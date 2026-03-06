package dev.jchristian.EncurtadorUrl.web.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterUserRequest(
        @NotBlank(message = "E-mail obrigatório")
        @Email(message = "Inválido o formato do E-mail")
        String email,
        @NotBlank(message = "Senha obrigatória")
        String password,
        @NotBlank(message = "Nome é brigatório")
        String name
) {
}