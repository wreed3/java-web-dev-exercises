package StudioExercises.studio_7_FunWithQuizzes;

import java.util.ArrayList;

public abstract class Question {

    private String question;
    private int pointValue;
    private int count = 0;


    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
        count ++;
    }

    public void displayQuestions() {
            System.out.println(question);
    }
    public abstract void  displayPossibleAnswer();

    public abstract boolean isCorrect(int value);

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public abstract int getCorrectAnswer();

}
