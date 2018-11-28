package com.zsoft.zexams.modules;

public class SuccessLoginResponse {
    private String username;
    private String id;
    private Object auth;

    public SuccessLoginResponse() {
    }

    public SuccessLoginResponse(String id, String u, Object a) {
        this.id = id;
        this.username = u;
        this.auth = a;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getAuth() {
        return auth;
    }

    public void setAuth(Object auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return '{' +
                "'id':" + username +
                "'username':" + username +
                ", 'auth':" + auth +
                '}';
    }
}
