package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> wordsArrayList = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println(nums);
        System.out.println(EvenNumbers.sum(nums));
        wordsArrayList.add("When");
        wordsArrayList.add("words");
        wordsArrayList.add("seven");
        System.out.println("What length word do you want to search for: ");
//        PrintFiveLetterWords.list(wordsArrayList);
        String str = "I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                " I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[]Arr4 = str.split(" ");
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(result, Arr4);
        PrintFiveLetterWords.list(result);



    }
}