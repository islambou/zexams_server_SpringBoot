package com.zsoft.zexams.modules;

public class UserCreds {
    String username;
    String password;
    boolean stay = true;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isStay() {
        return stay;
    }

    @Override
    public String toString() {
        return "UserCreds{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", stay=" + stay +
                '}';
    }
}
