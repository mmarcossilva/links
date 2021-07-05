package com.meli.links.link;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/link")
public class LinkController {

    @Autowired
    private LinkService service;

    @PostMapping("/")
    public ResponseEntity<Integer> insertLink(@RequestBody Link link){
        return new ResponseEntity<>(service.addLink(link), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public RedirectView getLink(@PathVariable int id, @RequestHeader(value = "password", defaultValue = "") String password){
        Link link = service.findLink(id, password);
        return new RedirectView(link.getUrl());
    }

    @PostMapping("/invalidade/{id}")
    public ResponseEntity<com.meli.links.link.LinkDTO> invalidadeUrl(@PathVariable int id){
        return new ResponseEntity<com.meli.links.link.LinkDTO>(com.meli.links.link.LinkDTO.convert(service.invalidateLink(id)), HttpStatus.OK);
    }
}
