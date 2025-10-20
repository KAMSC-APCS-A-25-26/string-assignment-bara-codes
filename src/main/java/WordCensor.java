import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        // Define bad words (manually, no arrays or lists)
        String badWord1 = "dang";
        String badWord2 = "nuts";
        String badWord3 = "oops";
        String badWord4 = "yikes";

        // Replace occurrences of each bad word with ***
        String censored = input;
        censored = censorWord(censored, badWord1);
        censored = censorWord(censored, badWord2);
        censored = censorWord(censored, badWord3);
        censored = censorWord(censored, badWord4);

        // Output censored text
        System.out.println("Censored: ");
        System.out.println(censored);

        scanner.close();
    }

    // Helper method that replaces all case-insensitive matches of a bad word
    private static String censorWord(String text, String word) {
        // Use regex to replace word boundaries, case-insensitive
        return text.replaceAll("(?i)\\b" + word + "\\b", "***");

        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
