package com.zsoft.zexams.modules;

import java.util.ArrayList;

public class UserQuestionAnswer {
    private String question;
    private ArrayList<String> answers = new ArrayList<>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "UserQuestionAnswer{" +
                "question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
