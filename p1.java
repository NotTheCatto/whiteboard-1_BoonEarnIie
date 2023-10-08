import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // Initialize input values
        int[] input = { 21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28 };

        // Begin sorting
        int temp = 0; // Initialize temp for exchanging values
        boolean sortComplete = false;   // Initialize sort complete status for checking sort status

        // Use for loop to go through each element in array
        while (sortComplete == false) {

            // Assume array is sorted before checking any problems with the array
            sortComplete = true; 

            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    // Elements are not sorted, so set sort status to false
                    sortComplete = false;

                    // Exchange values
                    temp = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = temp;
                }
            }
        }

        // Display output results
        System.out.print(Arrays.toString(input));
    }
}