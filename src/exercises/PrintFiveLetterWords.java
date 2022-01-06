package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintFiveLetterWords {
    private static int value;

    public static void list(ArrayList<String> listItems){
        Scanner input = new Scanner(System.in);
         value = input.nextInt();
        String[] arrayOfWords = new String[listItems.size()];
        listItems.toArray(arrayOfWords);
        for(String word : arrayOfWords){
            if(word.length() == PrintFiveLetterWords.value){
                System.out.println(word);
            }
        }
    }
}
