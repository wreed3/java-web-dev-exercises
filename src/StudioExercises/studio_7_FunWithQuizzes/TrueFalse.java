package StudioExercises.studio_7_FunWithQuizzes;


import java.util.Scanner;

public class TrueFalse extends Question{

    private int trueFalseAnswer;


    public TrueFalse(String questions, int pointValue, int trueFalseAnswer) {
        super(questions, pointValue);
        this.trueFalseAnswer = trueFalseAnswer;
        setPointValue(1);

    }

    @Override
    public void displayPossibleAnswer() {
        System.out.println("True or False");
    }


    @Override
    public boolean isCorrect(int chosenAnswer){
        if (chosenAnswer == trueFalseAnswer){
            return true;
        }else{
            return false;
        }
    }

   @Override
    public int getCorrectAnswer() {
       Scanner input = new Scanner(System.in);
       System.out.println("Please type '1' for True or '2' for False");
       int answer = input.nextInt();
       if (isCorrect(answer)) {
           return 1;
       } else {
           return 0;
       }
   }
}
