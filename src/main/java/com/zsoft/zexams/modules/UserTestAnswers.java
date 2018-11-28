package com.zsoft.zexams.modules;

import java.util.ArrayList;
import java.util.Date;

public class UserTestAnswers {
    private String id;
    private String date = new Date().toString();
    private String user;
    private String test;
    private ArrayList<UserQuestionAnswer> answers;
    private double mark;

    public UserTestAnswers(String user, String test, ArrayList<UserQuestionAnswer> answers, double mark) {
        this.user = user;
        this.test = test;
        this.answers = answers;
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public void setId(String id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "UserTestAnswers{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", test='" + test + '\'' +
                ", answers=" + answers +
                ", mark=" + mark +
                '}';
    }
}
