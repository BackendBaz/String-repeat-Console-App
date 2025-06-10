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
        }
        catch(InputMismatchException e) {
            System.out.println("\n'times' -> Please enter a number! Try again later.");
        } finally {
            System.out.println("\nBye!");
        }
    }
}
