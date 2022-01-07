package StudioExercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChapterThreeStudio {
    public static void main(String[] args) {
        HashMap<Character, Integer> countCharacter = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = scan.nextLine();
        myStr = myStr.toLowerCase();

        for(int i=0; i < myStr.length(); i++){
            int asciiValue = myStr.charAt(i);
//            System.out.println(myStr.charAt(i)+ " = " + asciiValue);
            if(asciiValue>96 && asciiValue < 123){
                if (!countCharacter.containsKey(myStr.charAt(i))) {
                    countCharacter.put(myStr.charAt(i), 1);
                } else {
                    countCharacter.put(myStr.charAt(i), countCharacter.get(myStr.charAt(i)) + 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : countCharacter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}



