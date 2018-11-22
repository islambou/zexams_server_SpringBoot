package com.zsoft.zexams.modules;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "question")
public class Question {
    @Id
    private String id;
    private ArrayList<Answer> answers;
    private String question;
    private String category;
    private Integer difficulty;

    public Question(ArrayList<Answer> answers, String question, String category, Integer difficulty) {
        this.answers = answers;
        this.question = question;
        this.category = category;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", answers=" + answers +
                ", question='" + question + '\'' +
                ", category='" + category + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }
}



