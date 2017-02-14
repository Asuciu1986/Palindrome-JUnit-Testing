
public class Palindrome {

    public static void main(String[] args) {

        String input = "";

        System.out.println(isPalindrome(input.length(), input.toLowerCase()));

    }

    private static boolean isPalindrome(int length, String input) {

        input = input.toLowerCase();

        if (!input.matches("[a-z0-9 ]+")) {
            return false;
        }

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
