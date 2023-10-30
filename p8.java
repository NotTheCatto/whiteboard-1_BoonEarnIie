public class p8 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cab";

        System.out.print(checkAnagram(s1, s2));
    }

    public static boolean checkAnagram(String s1, String s2) {

        // String object is immutable, but I need to change the content so I am using
        // StringBuilder.
        // This would be simpler if I was using C's primitive typed char array.
        StringBuilder tempStr1 = new StringBuilder(s1);
        StringBuilder tempStr2 = new StringBuilder(s2);

        System.out.println(tempStr1.length());

        // Going through and checking each of the character
        for (int i = 0; i < s1.length(); i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < s2.length(); j++) {
                System.err.println("j = " + j);
                if (s1.charAt(i) == tempStr2.charAt(j)) {
                    tempStr1.replace(i, i + 1, "*");
                    tempStr2.replace(j, j + 1, "*");
                    break;  
                }
            }
            System.out.println("\n");
        }

        System.out.println(tempStr1);
        System.out.println(tempStr2);

        // Checking if all characters are checked
        for (int i = 0; i < s1.length(); i++) {
            if (tempStr1.charAt(i) != '*') {
                return false;
            }
            if (tempStr2.charAt(i) != '*') {
                return false;
            }
        }

        return true;
    }
}