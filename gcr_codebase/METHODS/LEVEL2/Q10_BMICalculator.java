import java.util.*;

public class Q10_BMICalculator {

```
static double calculateBMI(double weight,double heightCm){

    double heightM = heightCm / 100.0;
    return weight/(heightM*heightM);
}

static String getStatus(double bmi){

    if(bmi < 18.5)
        return "Underweight";
    else if(bmi < 25)
        return "Normal";
    else if(bmi < 30)
        return "Overweight";
    else
        return "Obese";
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    double[][] persons = new double[10][3];

    for(int i=0;i<10;i++){

        System.out.print("Weight(kg): ");
        persons[i][0] = sc.nextDouble();

        System.out.print("Height(cm): ");
        persons[i][1] = sc.nextDouble();

        persons[i][2] =
            calculateBMI(persons[i][0],persons[i][1]);
    }

    System.out.println("\nWeight\tHeight\tBMI\tStatus");

    for(int i=0;i<10;i++){

        System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                persons[i][0],
                persons[i][1],
                persons[i][2],
                getStatus(persons[i][2]));
    }
}
```

}
