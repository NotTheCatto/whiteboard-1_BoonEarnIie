public class p4 {
    public static void main(String[] args) {
        // Initialize list 1 and list 2
        int[] list1 = { 4, 5, 2, 3, 1, 6 };
        int[] list2 = { 8, 7, 6, 9, 4, 5 };

        // Check intersections
        for (int i : list1) {
            for (int j : list2) {
                if (i == j){
                    System.out.println(i);
                }
            }
        }

    }
}
