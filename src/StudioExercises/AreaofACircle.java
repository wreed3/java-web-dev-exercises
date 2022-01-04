package StudioExercises;
import java.util.Scanner;

public class AreaofACircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?: ");
        Double radius;
        Double pi = 3.14;
    //Bonus Mission 1.0
//        if(input.hasNextDouble()){
//            radius = input.nextDouble();
//            if(radius<0) {
//                System.out.println(radius + " is not a valid number");
//            }else {
//                System.out.println("The area of your circle is:  " + Circle.getArea(radius));
//            }
//        }else if(input.hasNext()){
//            System.out.println("Please enter an valid number");
//        }
//Bonus Mission 2.0
        if(input.hasNextDouble()){
            radius = input.nextDouble();
            while(radius<0) {
                System.out.println(radius + " is not a valid number");
                System.out.println("What is the radius of your circle?: ");
                radius = input.nextDouble();
            }
            System.out.println("The area of your circle is:  " + Circle.getArea(radius));
        }else if(input.hasNext()){
            System.out.println("Please enter an valid number");
        }

    }
}

