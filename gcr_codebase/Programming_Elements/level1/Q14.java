import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards = " +
                yards + " and miles = " + miles);
    }
}
