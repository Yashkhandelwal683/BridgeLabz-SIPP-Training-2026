import java.util.*;

public class Q5_SpecialNumbers {

```
static boolean isPrime(int n){

    if(n<2) return false;

    for(int i=2;i<=Math.sqrt(n);i++)
        if(n%i==0)
            return false;

    return true;
}

static boolean isNeon(int n){

    int sq=n*n;
    int sum=0;

    while(sq>0){
        sum+=sq%10;
        sq/=10;
    }

    return sum==n;
}

static boolean isSpy(int n){

    int sum=0,product=1,temp=n;

    while(temp>0){
        int d=temp%10;
        sum+=d;
        product*=d;
        temp/=10;
    }

    return sum==product;
}

static boolean isAutomorphic(int n){

    int sq=n*n;

    return String.valueOf(sq)
            .endsWith(String.valueOf(n));
}

static boolean isBuzz(int n){

    return n%7==0 || n%10==7;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    System.out.println("Prime = "+isPrime(n));
    System.out.println("Neon = "+isNeon(n));
    System.out.println("Spy = "+isSpy(n));
    System.out.println("Automorphic = "+isAutomorphic(n));
    System.out.println("Buzz = "+isBuzz(n));
}
#!/bin/bash

# ================= Q6 Perfect / Abundant / Deficient / Strong =================

cat > Q6_NumberTypes.java <<'EOF'
import java.util.*;

public class Q6_NumberTypes {

```
static int sumProperDivisors(int n){
    int sum=0;
    for(int i=1;i<n;i++)
        if(n%i==0)
            sum+=i;
    return sum;
}

static boolean isPerfect(int n){
    return sumProperDivisors(n)==n;
}

static boolean isAbundant(int n){
    return sumProperDivisors(n)>n;
}

static boolean isDeficient(int n){
    return sumProperDivisors(n)<n;
}

static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++)
        fact*=i;
    return fact;
}

static boolean isStrong(int n){

    int temp=n,sum=0;

    while(temp>0){
        int digit=temp%10;
        sum+=factorial(digit);
        temp/=10;
    }

    return sum==n;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    System.out.println("Perfect = "+isPerfect(n));
    System.out.println("Abundant = "+isAbundant(n));
    System.out.println("Deficient = "+isDeficient(n));
    System.out.println("Strong = "+isStrong(n));
}
```

}
