package com.meli.links.link;

import com.meli.links.exceptions.ItemNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class LinkRepository {
    private static int id = 1;
    private HashMap<Integer, Link> links;

    public LinkRepository() {
        this.links = new HashMap<Integer, Link>();
    }

    public int addLink(Link link) {
        links.put(id, link);
        return id++;
    }

    public void updateLink(Link link, int id) {
        links.put(id, link);
    }

    public Link findById(int id) {
        Link link = links.get(id);
        if (link == null){
            throw new ItemNotFoundException();
        }
        return link;
    }
}
