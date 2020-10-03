package com.example.myapplication22;
import androidx.activity.ComponentActivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final class QuestionReader {
        /**
         * comment.
         */
private ComponentActivity activity;
private QuestionReader(final ComponentActivity componentActivity) {
        this.activity = componentActivity;
        }
 List<question> getquestion(final String fileName) throws IOException {
        InputStream is = activity.getAssets().open(fileName);
        Scanner s = new Scanner(is);
        List<question> q = new ArrayList<>();
        while (s.hasNextLine()) {
        String qtext = s.nextLine();
        List<String> cloices = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        cloices.add(s.nextLine());
        }
        String correctAnswer = s.nextLine();
        String photofile = s.nextLine();
        question question = new question();
        question.setQuestion(qtext);
        question.setChoices(cloices);
        question.setCorrectAnswer(correctAnswer);
        question.setPhotofile(photofile);
        }
        return q;

        }

        }