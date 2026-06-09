import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while(i <= n){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);

            i++;
        }

        sc.close();
    }
}

# Q6 Youngest and Tallest Friend
cat > Q6.java << 'EOF'
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        if(amarAge <= akbarAge && amarAge <= anthonyAge)
            System.out.println("Youngest: Amar");
        else if(akbarAge <= amarAge && akbarAge <= anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if(amarHeight >= akbarHeight && amarHeight >= anthonyHeight)
            System.out.println("Tallest: Amar");
        else if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");

        sc.close();
    }
}
