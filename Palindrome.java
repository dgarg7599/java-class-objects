import java.util.*;

class PalindromeChecker {
    String text;

    // Method to check if the string is a palindrome
    boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    void display() {
        System.out.println(text + " is palindrome: " + checkPalindrome(text));
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        // Taking input
        System.out.print("Enter a string: ");
        checker.text = sc.nextLine();

        // Display result
        checker.display();

        sc.close();
    }
}
/*Enter a string: aabbaa
aabbaa is palindrome: true
 */