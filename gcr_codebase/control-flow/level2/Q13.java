import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number > 0 && number < 100) {
            int i = 1;

            while(i < 100) {
                if(i % number == 0)
                    System.out.print(i + " ");

                i++;
            }
        }

        sc.close();
    }
}
