package dev.jchristian.EncurtadorUrl.web;

import dev.jchristian.EncurtadorUrl.domain.exceptions.ShortUrlNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ShortUrlNotFoundException.class)
    String handleShortUrlNotFoundException(ShortUrlNotFoundException ex) {
        log.error("URL curta não encontrada: {}", ex.getMessage());
        return "error/404";
    }

    @ExceptionHandler(Exception.class)
    String handleException(Exception ex) {
        log.error("Exceção não tratada: {}", ex.getMessage(), ex);
        return "error/500";
    }