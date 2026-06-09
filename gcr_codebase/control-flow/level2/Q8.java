import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 1;

        while(i < number) {
            if(number % i == 0)
                System.out.print(i + " ");

            i++;
        }

        sc.close();
    }
}
