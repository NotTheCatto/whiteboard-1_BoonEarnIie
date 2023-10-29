import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        // Initialize objects and variables
        Scanner input = new Scanner(System.in);
        String inputStr;
        
        // Prompt string
        System.out.print("Enter a string : ");
        inputStr = input.nextLine();

        // Call function to display results
        findMax(inputStr);

        input.close();
    }

    public static void findMax(String inputStr){
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            
            // Checking conditions for valid character
            if (((inputStr.charAt(i) >= 65) && (inputStr.charAt(i) <= 90)) || 
            ((inputStr.charAt(i) >= 97) && (inputStr.charAt(i) <= 122)) ||
            ((inputStr.charAt(i) >= 48) && (inputStr.charAt(i) <= 57))) {

                // Going through entire string to find occurence
                int count = 0;
                for (int j = 0; j < inputStr.length(); j++) {
                    if (inputStr.charAt(i) == inputStr.charAt(j)){
                        count++;
                    }
                }
                
                // Compare highest maximum count with newly discovered maximum count
                if (count > maxCount){
                    maxChar = inputStr.charAt(i);
                    maxCount = count;
                }
            }
        }

        // Display results
        System.out.println("Character : " + maxChar);
        System.out.println("Max occurences : " + maxCount);
    }
}
