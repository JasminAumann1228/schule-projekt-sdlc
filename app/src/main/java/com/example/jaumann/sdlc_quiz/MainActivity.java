package com.example.jaumann.sdlc_quiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView showQuestion, score, level;
    Button answerOne, answerTwo, answerThree, answerFour, endscreen;
    int points = 0;

    int actualQuestion = 0; //TODO  1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showQuestion = findViewById(R.id.question);
        findViewById(R.id.question).setBackgroundColor(Color.WHITE);
        score = findViewById(R.id.score);
        level = findViewById(R.id.level);
        answerOne = findViewById(R.id.button_answer_one);
        answerTwo = findViewById(R.id.button_answer_two);
        answerThree = findViewById(R.id.button_answer_three);
        answerFour = findViewById(R.id.button_answer_four);
        endscreen = findViewById(R.id.endscreen);

        Button start = (Button)findViewById(R.id.start_button);


        answerOne.setOnClickListener(this);
        answerTwo.setOnClickListener(this);
        answerThree.setOnClickListener(this);
        answerFour.setOnClickListener(this);

        start.setOnClickListener((view) -> {
            findViewById(R.id.start_button).setVisibility(View.GONE);
            findViewById(R.id.question).setVisibility(View.VISIBLE);
            findViewById(R.id.button_answer_one).setVisibility(View.VISIBLE);
            findViewById(R.id.button_answer_two).setVisibility(View.VISIBLE);
            findViewById(R.id.button_answer_three).setVisibility(View.VISIBLE);
            findViewById(R.id.button_answer_four).setVisibility(View.VISIBLE);
            score.setVisibility(View.VISIBLE);
        });

        };

    private void loadQuestion(){
        Questions questionsC = new Questions();
        ArrayList<String[]> questions = questionsC.getQuestions();
        String[] question = questions.get(actualQuestion);
        showQuestion.setText(question[0]); // testen mit actualquestion statt 0 ;
        findViewById(R.id.question).setBackgroundColor(Color.WHITE);
        answerOne.setVisibility(View.VISIBLE);
        answerTwo.setVisibility(View.VISIBLE);
        answerThree.setVisibility(View.VISIBLE);
        answerFour.setVisibility(View.VISIBLE);

        int ramdomNumber = (int) (Math.random() * (4-1) +1);

        switch (ramdomNumber){
            case 1:
                answerOne.setText(question[1]);
                answerTwo.setText(question[2]);
                answerThree.setText(question[3]);
                answerFour.setText(question[4]);
                break;
            case 2:
                answerOne.setText(question[2]);
                answerTwo.setText(question[1]);
                answerThree.setText(question[4]);
                answerFour.setText(question[3]);
                break;
            case 3:
                answerOne.setText(question[3]);
                answerTwo.setText(question[4]);
                answerThree.setText(question[1]);
                answerFour.setText(question[2]);
                break;
            case 4:
                answerOne.setText(question[4]);
                answerTwo.setText(question[3]);
                answerThree.setText(question[2]);
                answerFour.setText(question[1]);
                break;
        }
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_answer_one :
            if(QuestionBewerten(answerOne.getText().toString())){
                correctScreen(1);
                points++;
                score.setText("Points: " + points);
                checkLevel(points);
            }else {
                wrongScreen(1);
            }
            if(actualQuestion< 18){ //TODO: letzte Frage
                actualQuestion++;
           /*     try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } */

                loadQuestion();
            }
            else {
                endscreen();
            }
             break;


            case R.id.button_answer_two:
                if(QuestionBewerten(answerTwo.getText().toString())){
                    correctScreen(2);
                    points++;
                    score.setText("Points: " + points);
                    checkLevel(points);
                }else {
                    wrongScreen(2);
                }
                if(actualQuestion< 18){ //TODO : letzte Frage
                    actualQuestion++;
                    /*try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } */
                    loadQuestion();
                }else {
                    endscreen();
                }
                break;

            case R.id.button_answer_three:
                if(QuestionBewerten(answerThree.getText().toString())){
                    correctScreen(3);
                    points++;
                    score.setText("Points: " + points);
                    checkLevel(points);
                }else {
                    wrongScreen(3);
                }
                if(actualQuestion< 18){ //TODO : letzte Frage
                    actualQuestion++;
                 /*   try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/

                    loadQuestion();
                }else {
                    endscreen();
                }
                break;

            case R.id.button_answer_four:
                if(QuestionBewerten(answerFour.getText().toString())){
                    correctScreen(4);
                    points++;
                    score.setText("Points: " + points);
                    checkLevel(points);
                }else{
                    wrongScreen(4);
                }
                if(actualQuestion< 18){ //TODO : letzte Frage
                    actualQuestion++;
                  /*  try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } */

                    loadQuestion();
                }else {
                    endscreen();
                }
                break;

        }
    }

    private boolean QuestionBewerten(String button_text){
        boolean question = false;
        Questions questionsC = new Questions();
        ArrayList questions = questionsC.getQuestions();
        String[] save = (String[]) questions.get(actualQuestion);
        if(save[1].equals(button_text)){
            question = true;
        }
        return question;
    }

    private void checkLevel(int points){
       if(points >= 5 && points< 10){
           level.setText("Level: 2");
       }else if(points >= 10 && points < 15){
           level.setText("Level 3");
       }else if(points >= 15 &&points < 20){
           level.setText("Level 4");
       }else if(points >= 20 && points < 25){
           level.setText("Level 4");
       }else if(points >=25){
           level.setText("Level 5");
       }else if(points == 30){
           level.setText("YOU DID IT"); // TODO Winnerscreen einbauen
       }else{
           level.setText("Level: 1");
       }

    }


    private void endscreen() {
        answerOne.setVisibility(View.GONE);
        answerTwo.setVisibility(View.GONE);
        answerThree.setVisibility(View.GONE);
        answerFour.setVisibility(View.GONE);
        showQuestion.setVisibility(View.GONE);
        score.setVisibility(View.INVISIBLE);
        level.setVisibility(View.INVISIBLE);

        endscreen.setVisibility(View.VISIBLE);
        endscreen.setText("You finished with" + score + "in" + level);
    }

    private void correctScreen(int answerButton){

/*switch (answerButton) {

            case 1:
                answerTwo.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerOne.setTextSize(20);
                showQuestion.setBackgroundColor(Color.GREEN);
                break;
            case 2:
                answerOne.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerTwo.setTextSize(20);
                showQuestion.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                answerOne.setVisibility(View.INVISIBLE);
                answerTwo.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerThree.setTextSize(20);
                showQuestion.setBackgroundColor(Color.GREEN);
                break;
            case 4:
                answerOne.setVisibility(View.INVISIBLE);
                answerTwo.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);

                answerFour.setTextSize(20);
                showQuestion.setBackgroundColor(Color.GREEN);
                break;

        /* der richtige Screen, mit case, alle anderen answerButton werden invisible, Frage wird grün
        und die richtige Antwort wird größer angezeigt */

        //TODO: Schriftgröße und Farbe der Frage müssen beim neu laden wieder default gesetzt werden


       /* } */
    }



    private void wrongScreen(int answerButton) {

   /*     switch (answerButton) {

            case 1:
                answerTwo.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerOne.setTextSize(20);
                findViewById(R.id.question).setBackgroundColor(Color.RED);
                break;
            case 2:
                answerOne.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerTwo.setTextSize(20);
                findViewById(R.id.question).setBackgroundColor(Color.RED);
                break;
            case 3:
                answerOne.setVisibility(View.INVISIBLE);
                answerTwo.setVisibility(View.INVISIBLE);
                answerFour.setVisibility(View.INVISIBLE);

                answerThree.setTextSize(20);
                findViewById(R.id.question).setBackgroundColor(Color.RED);
                break;
            case 4:
                answerOne.setVisibility(View.INVISIBLE);
                answerTwo.setVisibility(View.INVISIBLE);
                answerThree.setVisibility(View.INVISIBLE);

                answerFour.setTextSize(20);
                findViewById(R.id.question).setBackgroundColor(Color.RED);
                break;



                /* die Frage wird in rot angezeigt und die richtige Antwort
                 * in groß */
      //  }
    }

};
