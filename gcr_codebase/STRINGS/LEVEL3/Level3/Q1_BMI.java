import java.util.Scanner;

public class Q1_BMI {

    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] getBMIData(double[][] persons) {

        String[][] result =
                new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {

            String[] bmiData =
                    calculateBMI(
                            persons[i][0],
                            persons[i][1]);

            result[i][0] =
                    String.valueOf(persons[i][0]);

            result[i][1] =
                    String.valueOf(persons[i][1]);

            result[i][2] =
                    bmiData[0];

            result[i][3] =
                    bmiData[1];
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println(
                "\nWeight\tHeight\tBMI\tStatus");

        for (String[] row : data) {

            System.out.println(
                    row[0] + "\t" +
                    row[1] + "\t" +
                    row[2] + "\t" +
                    row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons =
                new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.print(
                    "Weight(kg): ");
            persons[i][0] =
                    sc.nextDouble();

            System.out.print(
                    "Height(cm): ");
            persons[i][1] =
                    sc.nextDouble();
        }

        display(getBMIData(persons));
    }
}
