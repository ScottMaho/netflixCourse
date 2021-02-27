package com.company.SummativeAssessmentMahoneyScott.model;
import java.util.Objects;

public class word {
    
    private String word;
    private String definition;
    private int id;

    public word() {

    }

    public word(String word, String definition, int id) {
        this.word = word;
        this.definition = definition;
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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
        word word = (word) o;
        return getId() == word.getId() &&
                Objects.equals(getWord(), word.getWord()) &&
                Objects.equals(getDefinition(), word.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord(), getDefinition(), getId());
    }
}


