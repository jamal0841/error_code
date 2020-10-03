package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class compActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);
        TextView qtv=findViewById(R.id.questionYV);
        Button choic1=findViewById(R.id.button);
        Button choic2=findViewById(R.id.button2);
        Button choic3=findViewById(R.id.button3);
        Button[] choic={choic1,choic2,choic3};
        ImageView qphoto=findViewById(R.id.imageView);


        if (getIntent() !=null){
            Intent intent =getIntent();
            if (intent.hasExtra("name")){
                String name=intent.getStringExtra("name");
                TextView textView=findViewById(R.id.nametv);
                textView.setText(name);
            }
            try {
                QuestionReader questionReader=new QuestionReader(this);
                List<question> questions= questionReader.getquestion("jamal.txt");
                Collections.shuffle(questions);
          question qq=      questions.remove(0);
qtv.setText(qq.getQuestion());
for (int i=0;i<choic.length;i++){
    choic[i].setText(qq.getChoices().get(i));

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}