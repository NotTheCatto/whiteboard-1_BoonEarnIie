import java.util.*;

public class p2 {
    public static void main(String[] args) {
        // Initialize input values
        int[] input = new int[100];
        for (int i = 1; i <= input.length; i++) {
            input[i - 1] = i;
        }

        

        // Display output results
        System.out.print(Arrays.toString(input));
    }
}