import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum possible handshakes = " + handshakes);
    }
}
