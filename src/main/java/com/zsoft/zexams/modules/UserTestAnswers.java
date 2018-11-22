package com.zsoft.zexams.modules;

import java.util.ArrayList;

public class UserTestAnswers {
    private String id;
    private String user;
    private String test;
    private ArrayList<UserQuestionAnswer> answers;

    public UserTestAnswers(String user, String test, ArrayList<UserQuestionAnswer> answers) {
        this.user = user;
        this.test = test;
        this.answers = answers;
    }

    public String getId() {
        return id;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public ArrayList<UserQuestionAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<UserQuestionAnswer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "UserTestAnswers{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", test='" + test + '\'' +
                ", answers=" + answers +
                '}';
    }
}
