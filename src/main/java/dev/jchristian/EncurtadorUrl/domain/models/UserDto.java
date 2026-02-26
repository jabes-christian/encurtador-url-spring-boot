package dev.jchristian.EncurtadorUrl.domain.models;

import java.io.Serializable;

public record UserDto(Long id, String name) implements Serializable {
}