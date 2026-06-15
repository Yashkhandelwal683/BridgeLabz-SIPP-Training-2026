import java.util.*;

public class Q4_UnitConvertor1 {

```
static double convertKmToMiles(double km){
    return km*0.621371;
}

static double convertMilesToKm(double miles){
    return miles*1.60934;
}

static double convertMetersToFeet(double meter){
    return meter*3.28084;
}

static double convertFeetToMeters(double feet){
    return feet*0.3048;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter KM: ");
    double km=sc.nextDouble();

    System.out.println("Miles = "+convertKmToMiles(km));
    System.out.println("KM = "+convertMilesToKm(convertKmToMiles(km)));
}


}
#!/bin/bash

# ================= Q5 Unit Convertor 2 =================

cat > Q5_UnitConvertor2.java <<'EOF'
import java.util.*;

public class Q5_UnitConvertor2 {

```
static double convertYardsToFeet(double yards){
    return yards * 3;
}

static double convertFeetToYards(double feet){
    return feet * 0.333333;
}

static double convertMetersToInches(double meters){
    return meters * 39.3701;
}

static double convertInchesToMeters(double inches){
    return inches * 0.0254;
}

static double convertInchesToCm(double inches){
    return inches * 2.54;
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Yards: ");
    double yards = sc.nextDouble();

    System.out.println("Feet = " + convertYardsToFeet(yards));
    System.out.println("Yards = " + convertFeetToYards(convertYardsToFeet(yards)));

    System.out.print("Enter Meters: ");
    double meters = sc.nextDouble();

    System.out.println("Inches = " + convertMetersToInches(meters));
}
```

}
