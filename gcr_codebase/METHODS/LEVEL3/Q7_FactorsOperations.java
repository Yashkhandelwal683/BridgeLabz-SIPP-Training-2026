import java.util.*;

public class Q7_FactorsOperations {

```
static int[] factors(int n){

    int count=0;

    for(int i=1;i<=n;i++)
        if(n%i==0)
            count++;

    int[] arr=new int[count];
    int index=0;

    for(int i=1;i<=n;i++)
        if(n%i==0)
            arr[index++]=i;

    return arr;
}

static int greatestFactor(int[] arr){
    return arr[arr.length-1];
}

static int sumFactors(int[] arr){
    int sum=0;
    for(int x:arr) sum+=x;
    return sum;
}

static long productFactors(int[] arr){
    long product=1;
    for(int x:arr) product*=x;
    return product;
}

static double cubeProduct(int[] arr){
    double product=1;

    for(int x:arr)
        product*=Math.pow(x,3);

    return product;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] arr=factors(n);

    System.out.println("Factors:");
    for(int x:arr)
        System.out.print(x+" ");

    System.out.println("\nGreatest Factor = "+greatestFactor(arr));
    System.out.println("Sum = "+sumFactors(arr));
    System.out.println("Product = "+productFactors(arr));
    System.out.println("Cube Product = "+cubeProduct(arr));
}
```

}
