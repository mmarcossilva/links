package com.meli.links.link;

public class LinkDTO {
    private String url;
    private boolean valid;

    public LinkDTO(Link link) {
        this.url = link.getUrl();
        this.valid = link.isValid();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public static LinkDTO convert(Link link) {
        return new LinkDTO(link);
    }
}
