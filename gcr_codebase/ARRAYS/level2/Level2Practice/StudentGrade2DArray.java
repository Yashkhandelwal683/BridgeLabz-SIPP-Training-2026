import java.util.Scanner;

public class StudentGrade2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i=0;i<n;i++){

            for(int j=0;j<3;j++){
                marks[i][j] = sc.nextInt();
            }

            percentage[i] =
                (marks[i][0] +
                 marks[i][1] +
                 marks[i][2]) / 3.0;

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
