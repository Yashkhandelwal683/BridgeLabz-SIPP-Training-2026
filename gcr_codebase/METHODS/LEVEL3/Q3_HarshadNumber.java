import java.util.*;

public class Q3_HarshadNumber {

```
static int[] digits(int n){

    String s=String.valueOf(n);
    int[] arr=new int[s.length()];

    for(int i=0;i<s.length();i++)
        arr[i]=s.charAt(i)-'0';

    return arr;
}

static int digitSum(int[] arr){
    int sum=0;
    for(int x:arr) sum+=x;
    return sum;
}

static double squareSum(int[] arr){
    double sum=0;
    for(int x:arr)
        sum+=Math.pow(x,2);
    return sum;
}

static boolean harshad(int n,int[] arr){
    return n%digitSum(arr)==0;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int[] arr=digits(n);

    System.out.println("Digit Sum = "+digitSum(arr));
    System.out.println("Square Sum = "+squareSum(arr));
    System.out.println("Harshad = "+harshad(n,arr));

    int[][] freq=new int[10][2];

    for(int i=0;i<10;i++)
        freq[i][0]=i;

    for(int d:arr)
        freq[d][1]++;

    for(int i=0;i<10;i++)
        if(freq[i][1]>0)
            System.out.println(i+" -> "+freq[i][1]);
}
```

}
