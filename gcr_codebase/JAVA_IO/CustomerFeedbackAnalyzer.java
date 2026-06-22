import java.util.Scanner;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 0; i < 5; i++) {

            String feedback = sc.nextLine();

            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}