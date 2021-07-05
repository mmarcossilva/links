package com.meli.links.exceptions;

public class LinkNotValidException extends RuntimeException {
    public LinkNotValidException() {
        super("Link invalido");
    }
}
