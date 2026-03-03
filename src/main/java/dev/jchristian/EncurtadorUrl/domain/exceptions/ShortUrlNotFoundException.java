package dev.jchristian.EncurtadorUrl.domain.exceptions;

public class ShortUrlNotFoundException extends RuntimeException {

    public ShortUrlNotFoundException(String message) {
        super(message);
    }
}