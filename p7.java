import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        // Initialize objects and variables
        Scanner input = new Scanner(System.in);
        int n1 = 1;

        // Prompt number to be sqaure rooted
        try {
            System.out.print("Enter a number to be square rooted > ");
            n1 = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number input");
        }
        
        System.out.println("Sqaure root of " + n1 + " is " + sqrt(n1));

        input.close();
    }

    public static int sqrt(int squareValue){
        if(squareValue < 0){
            // Flip value to positive since sqaure root always produces a positive value
            squareValue = squareValue * -1;
        }

        // Trial and error starting from value 0
        int testValue = 0;

        while (testValue * testValue != squareValue) {
            testValue++;

            // To control looping in case of an infinity loop
            if (testValue > 999999){
                return -1; 
            }
        }

        return testValue;
    }
}
