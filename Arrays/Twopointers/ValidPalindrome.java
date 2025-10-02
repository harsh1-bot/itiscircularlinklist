package Arrays.Twopointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String formattedString = s.toLowerCase();
        int low = 0;
        int high = s.length();
        boolean checkPalindrome = true;
        while (s.charAt(low) == s.charAt(high - 1)) {
            low++;
            high--;
            return checkPalindrome;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?";
        int leftPointer = 0;
        int rightPointer = str.length() - 1;

        boolean result = true;
        String formattedString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                formattedString += str.charAt(i);

            }
        }
        System.out.println(formattedString);
        // while (leftPointer < rightPointer) {
        //     System.out.println(str.charAt(leftPointer) + " <-> " + str.charAt(rightPointer));

        //     if (str.charAt(leftPointer) != str.charAt(rightPointer)) {
        //         result = false;
        //         break;
        //     }

        //     leftPointer++;
        //     rightPointer--;
        // }
        // System.out.println(result);

    }
}
