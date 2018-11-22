package com.zsoft.zexams.modules;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserRole {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public UserRole(String id) {
        this.id = id;
    }
}
