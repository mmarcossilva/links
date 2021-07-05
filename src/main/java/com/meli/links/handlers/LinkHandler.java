package com.meli.links.handlers;

import com.meli.links.exceptions.ExceptionDTO;
import com.meli.links.exceptions.InvalidPasswordException;
import com.meli.links.exceptions.ItemNotFoundException;
import com.meli.links.exceptions.LinkNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LinkHandler {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<?> hadleItemNotFound(ItemNotFoundException exception){
        return ResponseEntity.notFound().build();
    }

    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ExceptionDTO> handleInvalidPassword(InvalidPasswordException exception){
        return ResponseEntity.badRequest().body(new ExceptionDTO(exception.getMessage()));
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(LinkNotValidException.class)
    public ResponseEntity<ExceptionDTO> handleInvalidPassword(LinkNotValidException exception){
        return ResponseEntity.badRequest().body(new ExceptionDTO(exception.getMessage()));
    }
}
