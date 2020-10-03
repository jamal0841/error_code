package com.example.myapplication22;

import java.util.List;

public class question {
    String question;
    List<String > choices;
    String correctAnswer;
    String photofile;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setPhotofile(String photofile) {
        this.photofile = photofile;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getPhotofile() {
        return photofile;
    }
}
