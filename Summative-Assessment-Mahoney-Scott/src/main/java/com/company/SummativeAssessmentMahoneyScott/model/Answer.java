package com.company.SummativeAssessmentMahoneyScott.model;

import java.util.Objects;

public class Answer {
    private String question;
    private String answer;
    private int id;

    public Answer() {

    }

    public Answer(String answer, int id) {

        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return getId() == answer.getId() &&
                Objects.equals(getAnswer(), answer.getAnswer()) &&
                Objects.equals(getQuestion(), answer.getQuestion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestion(), getAnswer(), getId());
    }

}


