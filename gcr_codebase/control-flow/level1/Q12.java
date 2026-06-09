import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formula = n * (n + 1) / 2;

            System.out.println("While Sum = " + sum);
            System.out.println("Formula Sum = " + formula);
            System.out.println("Both Equal? " + (sum == formula));
        } else {
            System.out.println("Not a Natural Number");
        }

        sc.close();
    }
}
