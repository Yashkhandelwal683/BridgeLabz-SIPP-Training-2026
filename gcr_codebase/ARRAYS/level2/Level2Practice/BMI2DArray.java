import java.util.Scanner;

public class BMI2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for(int i=0;i<n;i++){

            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();

            personData[i][2] =
                personData[i][0] /
                (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if(bmi < 18.5)
                status[i] = "Underweight";
            else if(bmi < 25)
                status[i] = "Normal";
            else if(bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for(int i=0;i<n;i++){

            System.out.println(
                "Weight=" + personData[i][0] +
                " Height=" + personData[i][1] +
                " BMI=" + personData[i][2] +
                " Status=" + status[i]
            );
        }

        sc.close();
    }
}
