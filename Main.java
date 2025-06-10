import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("** String Repeat **\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your text: ");
            String user_text = scanner.nextLine();
            System.out.print("How many times do you want to repeat the text? ");
            int user_times = scanner.nextInt();
            String resultText = generateRepeatText(user_times, user_text);
            System.out.printf("Result: %s\n", resultText);
        } catch(InputMismatchException e) {
            System.out.println("\n'times' -> Please enter a number! Try again later.");
        } catch(Exception e) {
            System.out.printf("\nError -> %s! Try again later.\n", e.getMessage());
        } finally {
            System.out.println("\nBye!");
        }
    }

    private static String generateRepeatText(int times, String text)
            throws Exception {
        // Negative Number:
        if (times < 0) throw new Exception("The number of times must be positive or zero");
        // Zero Number:
        else if (times == 0) return text;
        StringBuilder result = new StringBuilder();
        return result.repeat(text, times).toString();
    }
}
