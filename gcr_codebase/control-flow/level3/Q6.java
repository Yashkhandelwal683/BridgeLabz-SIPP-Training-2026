import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        while(number != 0) {
            count++;
            number /= 10;
        }

        System.out.println("Number of Digits = " + count);

        sc.close();
    }
}
