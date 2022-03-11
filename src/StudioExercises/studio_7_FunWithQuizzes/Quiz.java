package StudioExercises.studio_7_FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int total;


    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for(int i= 0; i < questions.size(); i++){
            this.total += questions.get(i).getPointValue();
        }
    }

    public void addQuestion(Question question){
        this.questions.add(question);
        this.total += question.getPointValue();
    }

    public void newScore(int point){
        this.score += point;
    }

    public void quizGrade(){
        System.out.println(("Your score is: " + score + " out of " + total));
    }


    public void runQuiz (){

        for(int i=0; i<questions.size(); i++){
            questions.get(i).displayQuestions();
            questions.get(i).displayPossibleAnswer();
            int points = questions.get(i).getCorrectAnswer();
            newScore(points);
            }

        }
    }

