package com.company.SummativeAssessmentMahoneyScott.model;

import java.util.List;
import java.util.Objects;

public class quote {
    private String quote;
    private String author;
    private int id;

    public quote() {

    }

    public quote(String quote, String author, int id) {

        this.quote = quote;
        this.author = author;
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        quote quote = (quote) o;
        return getId() == quote.getId() &&
                Objects.equals(getQuote(), quote.getQuote()) &&
                Objects.equals(getAuthor(), quote.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuote(), getAuthor(), getId());
    }

}
