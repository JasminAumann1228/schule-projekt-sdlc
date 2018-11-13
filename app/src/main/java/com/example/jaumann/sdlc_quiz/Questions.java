package com.example.jaumann.sdlc_quiz;

import java.util.ArrayList;

public class Questions {

    ArrayList<String[]> questions;

    public Questions(){
        questions= new ArrayList<>(19); //TODO: Anzahl der Fragen
        fillQuestions();
    }

    private void fillQuestions(){
        String[] question1 = new String[5];
        question1[0]= "What does SDLC stand for?";
        question1[1]= "Software Development Life Cycle";
        question1[2]= "Software Development Live Cycle";
        question1[3]= "Software Developer Life Cycle";
        question1[4]= "Antwort4"; //TODO antwort finden

        String[] question2 = new String[5];
        question2[0]= "What is no popular SDLC model?";
        question2[1]= "racetrack model";
        question2[2]= "waterfall model";
        question2[3]= "spiral model";
        question2[4]= "agile model";

        String[] question3 = new String[5];
        question3[0]= "Wich is no SDLCs main task?";
        question3[1]= "Highest quantity";
        question3[2]= "Highest quality";
        question3[3]= "Shortest time";
        question3[4]= "Lowest cost";

        String[] question4 = new String[5];
        question4[0]= "Wich SDLC model is the oldest and most straightforeward?";
        question4[1]= "waterfall model";
        question4[2]= "spiral model";
        question4[3]= "agile model";
        question4[4]= "racetrack model";

        String[] question5 = new String[5];
        question5[0]= "Wich SDLC model separates the product into cycles and delivers a working product very quickly?";
        question5[1]= "agile model";
        question5[2]= "spiral model";
        question5[3]= "racetrack model";
        question5[4]= "waterfall model";

        String[] question6 = new String[5];
        question6[0]= "Wich SDLC model is the most flexible?";
        question6[1]= "spiral model";
        question6[2]= "agile model";
        question6[3]= "waterfall model";
        question6[4]= "racetrack model";

        String[] question7 = new String[5];
        question7[0]= "Wich is no stage of SDLC?";
        question7[1]= "Racing";
        question7[2]= "Planning";
        question7[3]= "Testing";
        question7[4]= "Designing";

        String[] question8 = new String[5];
        question8[0]= "Wich is the most important and fundamental stage of SDLC?";
        question8[1]= "Planning";
        question8[2]= "Testing";
        question8[3]= "Designing";
        question8[4]= "Racing";

        String[] question9 = new String[5];
        question9[0]= "In wich stage of SDLC the development starts and the product is built?";
        question9[1]= "Building";
        question9[2]= "Deployment";
        question9[3]= "Testing";
        question9[4]= "Designing";

        String[] question10 = new String[5];
        question10[0]= "This stage comes after testing.";
        question10[1]= "Deployment";
        question10[2]= "Planning";
        question10[3]= "Racing";
        question10[4]= "Designing";

        String[] question11 = new String[5];
        question11[0]= "What does MVC-Pattern stand for?";
        question11[1]= "Model-View-Controller-Pattern";
        question11[2]= "Multiple-Virtual-Currency-Pattern";
        question11[3]= "My-Very-Cool-Pattern";
        question11[4]= "Most-Valueable-Computing-Pattern";

        String[] question12 = new String[5];
        question12[0]= "What is the main function of MVC-Pattern?";
        question12[1]= "Seperate data storage, presentation and control";
        question12[2]= "Connect data storage, presentation and control";
        question12[3]= "Delete data storage, presentation and control";
        question12[4]= "Create data storage, presentation and control";

        String[] question13 = new String[5];
        question13[0]= "What is the sense of MVC-Pattern?";
        question13[1]= "A flexible program draft, easy extention and modification";
        question13[2]= "Antwort2"; //TODO antwort finden
        question13[3]= "Antwort3"; //TODO antwort finden
        question13[4]= "Antwort4"; //TODO antwort finden

        String[] question14 = new String[5];
        question14[0]= "What does REST stand for?";
        question14[1]= "Representational State Transfer Architecture";
        question14[2]= "Antwort2"; //TODO antwort finden
        question14[3]= "Antwort3"; //TODO antwort finden
        question14[4]= "Antwort4"; //TODO antwort finden

        String[] question15 = new String[5];
        question15[0]= "What is the objective of REST";
        question15[1]= "Describing how the web should work";
        question15[2]= "Antwort2"; //TODO antwort finden
        question15[3]= "Antwort3"; //TODO antwort finden
        question15[4]= "Antwort4"; //TODO antwort finden

        String[] question16 = new String[5];
        question16[0]= "This REST method removes resources.";
        question16[1]= "DELETE";
        question16[2]= "PUT";
        question16[3]= "GET";
        question16[4]= "POST";

        String[] question17 = new String[5];
        question17[0]= "This REST method creates or replaces resources.";
        question17[1]= "PUT";
        question17[2]= "POST";
        question17[3]= "GET";
        question17[4]= "DELETE";

        String[] question18 = new String[5];
        question18[0]= "This REST method adds something to a resource.";
        question18[1]= "POST";
        question18[2]= "DELETE";
        question18[3]= "GET";
        question18[4]= "PUT";

        String[] question19 = new String[5];
        question19[0]= "This REST method queries the resources.";
        question19[1]= "GET";
        question19[2]= "DELETE";
        question19[3]= "POST";
        question19[4]= "PUT";

        questions.add(0,question1);
        questions.add(1,question2);
        questions.add(2,question3);
        questions.add(3,question4);
        questions.add(4,question5);
        questions.add(5,question6);
        questions.add(6,question7);
        questions.add(7,question8);
        questions.add(8,question9);
        questions.add(9,question10);
        questions.add(10,question11);
        questions.add(11,question12);
        questions.add(12,question13);
        questions.add(13,question14);
        questions.add(14,question15);
        questions.add(15,question16);
        questions.add(16,question17);
        questions.add(17,question18);
        questions.add(18,question19);



    }

    public ArrayList<String[]> getQuestions(){
        return questions;
    }
}
