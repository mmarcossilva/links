package com.meli.links.exceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException() {
        super("Senha incorreta");
    }
}
