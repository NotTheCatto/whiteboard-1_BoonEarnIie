import java.util.*;

public class p2 {
    public static void main(String[] args) {
        // Initialize input values
        int[] input = new int[100];
        for (int i = 1; i <= input.length; i++) {
            input[i - 1] = i;
        }

        // Process and display results
        for (int i : input) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("FizzBuzz");
            }

            else if ((i % 3) == 0) {
                System.out.println("Fizz");
            }

            else if ((i % 5) == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }
}