import java.util.*;

public class Q6_ThrowThrows {

```
static double calculateInterest(
        double amount,
        double rate,
        int years) throws IllegalArgumentException {

    if(amount < 0 || rate < 0){
        throw new IllegalArgumentException(
            "Amount and rate must be positive");
    }

    return (amount * rate * years) / 100;
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    try{
        double amount = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        double interest =
                calculateInterest(
                amount,rate,years);

        System.out.println(
                "Interest = " + interest);

    }catch(IllegalArgumentException e){

        System.out.println(
        "Invalid input: " + e.getMessage());
    }
}
```

}
