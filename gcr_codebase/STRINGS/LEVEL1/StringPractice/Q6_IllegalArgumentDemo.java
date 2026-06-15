import java.util.Scanner;

public class Q6_IllegalArgumentDemo {

    public static void generateException(String text) {
        throw new IllegalArgumentException("Invalid Argument");
    }

    public static void handleException(String text) {

        try {

            throw new IllegalArgumentException("Invalid Argument");

        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException Handled");

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);
    }
}