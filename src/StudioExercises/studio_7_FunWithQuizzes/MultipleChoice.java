package StudioExercises.studio_7_FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<Integer> multipleChoicePossibleAnswer;
    private int correctAnswer;


    public MultipleChoice(String question, int pointValue, int correctAnswer, ArrayList<Integer> multipleChoicePossibleAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.multipleChoicePossibleAnswer = multipleChoicePossibleAnswer;
        setPointValue(1);
    }

    @Override
    public void displayPossibleAnswer() {
        for(int i = 0; i < multipleChoicePossibleAnswer.size(); i++)
        System.out.println(multipleChoicePossibleAnswer.get(i));
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
