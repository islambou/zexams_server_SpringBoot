package com.zsoft.zexams.modules;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "test")
public class Test {
    @Id
    private String id;
    private ArrayList<String> questions;
    private String test;

    public Test(ArrayList<String> questions, String test) {
        this.questions = questions;
        this.test = test;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", questions=" + questions +
                ", test='" + test + '\'' +
                '}';
    }
}



