package com.meli.links.link;

import com.meli.links.exceptions.InvalidPasswordException;
import com.meli.links.exceptions.LinkNotValidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {
    @Autowired
    private com.meli.links.link.LinkRepository repository;

    public int addLink(Link link){
        return repository.addLink(link);
    }

    public Link findLink(int id, String password) {
        Link link = repository.findById(id);
        link.addClick();
        repository.updateLink(link, id);
        if(!link.isValid())
            throw new LinkNotValidException();
        if(!link.getPassword().equals(password))
            throw new InvalidPasswordException();
        return link;
    }

    public Link invalidateLink(int id){
        Link link = repository.findById(id);
        link.setValid(false);
        repository.updateLink(link, id);
        return link;
    }
}
