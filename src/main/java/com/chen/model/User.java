package com.chen.model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Boolean active;

    public User(Integer id, String username, String password, Boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}