import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Addition = " + (n1+n2));
        System.out.println("Subtraction = " + (n1-n2));
        System.out.println("Multiplication = " + (n1*n2));
        System.out.println("Division = " + (n1/n2));
    }
}
