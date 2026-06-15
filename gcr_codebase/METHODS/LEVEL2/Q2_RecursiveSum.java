import java.util.*;

public class Q2_RecursiveSum {

```
static int recursiveSum(int n){
    if(n==1) return 1;
    return n + recursiveSum(n-1);
}

static int formulaSum(int n){
    return n*(n+1)/2;
}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter n: ");
    int n=sc.nextInt();

    int rec=recursiveSum(n);
    int formula=formulaSum(n);

    System.out.println("Recursive Sum = "+rec);
    System.out.println("Formula Sum = "+formula);

    if(rec==formula)
        System.out.println("Both Results Match");
    else
        System.out.println("Results Do Not Match");
}
```

}
