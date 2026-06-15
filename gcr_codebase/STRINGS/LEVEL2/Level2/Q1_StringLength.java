import java.util.Scanner;

public class Q1_StringLength {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Custom Length  : " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}
