import java.util.*;

public class p3 {
    public static void main(String[] args) {
        // Initialize variables and objects
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0, i = 0;

        // Prompt input
        try {
            System.out.print("Enter 1st number of the fibonacci sequence > ");
            n1 = input.nextInt();
        } catch (Exception e) {
            System.out.print("Invalid input for 1st number\n");
            input.next();
        }

        try {
            System.out.print("Enter 2nd number of the fibonacci sequence > ");
            n2 = input.nextInt();
        } catch (Exception e) {
            System.out.print("Invalid input for 2nd number\n");
            input.next();
        }

        try {
            System.out.print("Enter number of elements to generate > ");
            i = input.nextInt();
        } catch (Exception e) {
            System.out.print("Invalid input for number of elements\n");
            input.next();
        }

        // Process and display results
        System.out.println(n1 + ", \n" + n2 + ", ");
        System.out.println(fibonacci(n1, n2, i));

        input.close();
    }

    public static int fibonacci(int i, int j, int limit) {
        if (limit - 1 > 0) {
            System.out.println(i + j + ", ");
            return fibonacci(j, i + j, limit - 1);
        } else {
            return i + j;
        }
    }

}
