public class p5 {
    public static void main(String[] args) {
        // Initialize list 1 and list 2 and variables
        int[] list1 = { 4, 5, 2, 3, 1, 6 };
        int[] list2 = { 8, 7, 6, 9, 4, 5 };
        boolean checkRepeat = false;

        // Check repeated values from list 1
        for (int i : list1) {
            checkRepeat = false;
            for (int j : list2) {
                if (i == j) {
                    checkRepeat = true;
                }
            }
            if (checkRepeat == false) {
                // Difference found, display values
                System.out.println(i);
            }
        }

        // Check repeated values from list 2
        for (int i : list2) {
            checkRepeat = false;
            for (int j : list1) {
                if (i == j) {
                    checkRepeat = true;
                }
            }
            if (checkRepeat == false) {
                // Difference found, display values
                System.out.println(i);
            }
        }
    }
}
