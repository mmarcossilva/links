package com.meli.links.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException() {
        super("Iem não encontrado");
    }
}
