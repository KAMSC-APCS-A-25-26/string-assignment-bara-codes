import java.util.Scanner;

public class PalindromeChecker {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int length = word.length();
        String reverse = "";
        for (int j =0; j<length; j++)
            {
                reverse = reverse + word.charAt(length-j-1);
            }
        if (word.equals(reverse))
        {
            System.out.println(word + " is a palindrome!");
        }
        else
        {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
