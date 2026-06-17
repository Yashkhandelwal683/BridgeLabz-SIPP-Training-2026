import java.util.*;

public class Q4_MultipleCatch {

```
public static void main(String[] args){

    int[] arr = {10,20,30,40,50};

    Scanner sc = new Scanner(System.in);

    try{
        int index = sc.nextInt();
        System.out.println(
                "Value at index " + index +
                ": " + arr[index]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid index!");
    }
    catch(NullPointerException e){
        System.out.println(
                "Array is not initialized!");
    }
}
```

}
