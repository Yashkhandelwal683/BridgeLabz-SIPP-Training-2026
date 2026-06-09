import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;

        while(counter >= 1) {
            if(number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest Factor = " + greatestFactor);

        sc.close();
    }
}

# Q11 Multiples of a Number Below 100 (For Loop)
cat > Q11.java << 'EOF'
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number > 0 && number < 100) {
            for(int i = 1; i < 100; i++) {
                if(i % number == 0)
                    System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
