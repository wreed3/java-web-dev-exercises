package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[]Arr = {1,1,2,3,5,8};
        int i;
        for (i=0; i<Arr.length; i++) {
            if(Arr[i]%2 == 1){
                System.out.println(Arr[i]);
            }
        }
        String str = "I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                " I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[]Arr2 = str.split(" ");
        System.out.println(Arrays.toString(Arr2));
        String[]Arr3 = str.split("\\.");
        System.out.println(Arrays.toString(Arr3));
    }
}

