import java.util.Scanner;

public class StudentGradeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        for(int i=0;i<n;i++){

            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();

            percentage[i] =
                (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if(percentage[i] >= 90)
                grade[i] = 'A';
            else if(percentage[i] >= 75)
                grade[i] = 'B';
            else if(percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for(int i=0;i<n;i++){
            System.out.println(
                percentage[i] + " " + grade[i]
            );
        }

        sc.close();
    }
}
