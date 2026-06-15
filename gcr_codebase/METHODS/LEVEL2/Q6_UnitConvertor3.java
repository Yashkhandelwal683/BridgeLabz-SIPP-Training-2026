import java.util.*;

public class Q6_UnitConvertor3 {

```
static double fahrenheitToCelsius(double f){
    return (f - 32) * 5 / 9;
}

static double celsiusToFahrenheit(double c){
    return (c * 9 / 5) + 32;
}

static double poundsToKilograms(double pounds){
    return pounds * 0.453592;
}

static double kilogramsToPounds(double kg){
    return kg * 2.20462;
}

static double gallonsToLiters(double gallons){
    return gallons * 3.78541;
}

static double litersToGallons(double liters){
    return liters * 0.264172;
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Fahrenheit: ");
    double f = sc.nextDouble();

    System.out.println("Celsius = " + fahrenheitToCelsius(f));

    System.out.print("Enter Pounds: ");
    double p = sc.nextDouble();

    System.out.println("Kilograms = " + poundsToKilograms(p));
}
```

}
