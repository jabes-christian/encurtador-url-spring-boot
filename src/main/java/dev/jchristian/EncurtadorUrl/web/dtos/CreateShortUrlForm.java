package dev.jchristian.EncurtadorUrl.web.dtos;

import jakarta.validation.constraints.NotBlank;

public record CreateShortUrlForm(
        @NotBlank(message = "A URL Original é obrigatória")
        String originalUrl) {
}
