import java.util.*;

public class Q12_RandomStatistics {

```
static int[] generate4DigitRandomArray(int size){

    int[] arr = new int[size];

    for(int i=0;i<size;i++){
        arr[i] = (int)(Math.random()*9000)+1000;
    }

    return arr;
}

static double[] findAverageMinMax(int[] arr){

    int min = arr[0];
    int max = arr[0];
    int sum = 0;

    for(int x : arr){

        sum += x;

        min = Math.min(min,x);
        max = Math.max(max,x);
    }

    double avg = (double)sum/arr.length;

    return new double[]{avg,min,max};
}

public static void main(String[] args){

    int[] numbers =
        generate4DigitRandomArray(5);

    System.out.println("Random Numbers:");

    for(int x:numbers){
        System.out.print(x+" ");
    }

    System.out.println();

    double[] result =
        findAverageMinMax(numbers);

    System.out.println("Average = "+result[0]);
    System.out.println("Minimum = "+(int)result[1]);
    System.out.println("Maximum = "+(int)result[2]);
}
```

}
