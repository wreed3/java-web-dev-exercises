package StudioExercises.studio_7_FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question{

    private ArrayList<String> checkboxPossibleAnswers;
    private int correctAnswer;

    public CheckBox(String question, ArrayList<String> checkboxPossibleAnswers, int correctAnswer, int pointValue) {
        super(question, pointValue);
        this.checkboxPossibleAnswers = checkboxPossibleAnswers;
        this.correctAnswer = correctAnswer;
        setPointValue(1);
    }

    @Override
    public void displayPossibleAnswer() {
        for(int i = 0; i < checkboxPossibleAnswers.size(); i++){
            System.out.println(checkboxPossibleAnswers.get(i));
        }
    }

    public boolean isCorrect(int index){
        if (index == correctAnswer){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getCorrectAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you answer as a numeric value.");
        String Answer = input.nextLine();
        int value = Integer.parseInt(Answer);
        if(isCorrect(value)){
            return 1;
        }else {
            return 0;
        }

    }

}
