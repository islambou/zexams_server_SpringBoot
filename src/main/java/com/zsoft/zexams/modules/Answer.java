package com.zsoft.zexams.modules;

public class Answer {
    private String answer;
    private Boolean correct;

    public Answer(String answer, Boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", correct=" + correct +
                '}';
    }
}

