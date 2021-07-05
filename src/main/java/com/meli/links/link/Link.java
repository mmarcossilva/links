package com.meli.links.link;

public class Link {
    private String url;
    private String password;
    private long timesClicked;
    private boolean valid;

    public Link(String url, String password) {
        this.url = url;
        this.password = password;
        this.timesClicked = 0;
        this.valid = true;
    }

    public long getTimesClicked() {
        return timesClicked;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setTimesClicked(long timesClicked) {
        this.timesClicked = timesClicked;
    }

    public void addClick(){
        this.timesClicked++;
    }

    public boolean validadePassword(String password){
        if (password == null)
            return true;
        return password.equals(this.password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
