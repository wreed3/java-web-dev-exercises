package exercises;

import java.util.ArrayList;

public class EvenNumbers {
    public static int sum(ArrayList<Integer> sum) {
        int total = 0;
        for (int i = 0; i < sum.size(); i++) {
            if (sum.get(i) % 2 == 0) {
                total = total + sum.get(i);
            }
        }
        return total;
    }
}