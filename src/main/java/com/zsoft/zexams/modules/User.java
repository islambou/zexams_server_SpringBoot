package com.zsoft.zexams.modules;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private ArrayList<UserRole> roles;

    public String getId() {
        return id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public User(String username, ArrayList<UserRole> roles) {
        this.username = username;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<UserRole> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
