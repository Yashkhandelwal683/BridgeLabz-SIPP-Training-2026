import java.util.*;

public class Q9_NestedTryCatch {

```
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int[] arr = {10,20,30,40,50};

    try{

        System.out.print("Index: ");
        int index = sc.nextInt();

        try{

            System.out.print("Divisor: ");
            int divisor = sc.nextInt();

            int result =
                    arr[index] / divisor;

            System.out.println(
                    "Result = " + result);

        }catch(ArithmeticException e){

            System.out.println(
            "Cannot divide by zero!");
        }

    }catch(ArrayIndexOutOfBoundsException e){

        System.out.println(
        "Invalid array index!");
    }
}
```

}
