package exercises;
import java.util.Scanner;

public class TermInSentence {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String newSentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search");
        String word = input.nextLine().toLowerCase();

        Boolean result = newSentence.contains(word);
        System.out.println("It is " + result +"! The sentence contains your search word: " + word );

        Integer index = newSentence.indexOf(word);
        Integer length = word.length();
        System.out.println("Your word first appears at index " + index + ". Your word is " + length + " characters long.");
        String changeSentence = newSentence.replace(word, "____(*Your word selection was removed*)" );
        System.out.println(changeSentence);



    }
}
