package StudioExercises.studio_7_FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz mathQuiz = new Quiz(new ArrayList<>());
        ArrayList<Integer> answer1 = new ArrayList<>(Arrays.asList(5,10,15,20));
        MultipleChoice multipleChoiceQuestion1 = new MultipleChoice("What is 5 + 10? ", 1,3, answer1);
        mathQuiz.addQuestion(multipleChoiceQuestion1);

        ArrayList<String> answer2 = new ArrayList<>(Arrays.asList("Ten","Twenty-four","Twenty","Two"));
        CheckBox checkBoxQuestion1 = new CheckBox("What is 6 x 4? ", answer2,2, 1);
        mathQuiz.addQuestion(checkBoxQuestion1);

        TrueFalse trueFalseQuestion1 = new TrueFalse("Is 30/5 = 6 ", 1, 1);
        mathQuiz.addQuestion(trueFalseQuestion1);

        mathQuiz.runQuiz();
        mathQuiz.quizGrade();








    }

}
