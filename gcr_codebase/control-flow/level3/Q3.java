import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;

        String grade;

        if(percentage >= 90)
            grade = "A+";
        else if(percentage >= 80)
            grade = "A";
        else if(percentage >= 70)
            grade = "B";
        else if(percentage >= 60)
            grade = "C";
        else if(percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
