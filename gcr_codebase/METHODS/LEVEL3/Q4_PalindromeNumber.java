import java.util.*;

public class Q4_PalindromeNumber {

```
static int[] digits(int n){

    String s=String.valueOf(n);
    int[] arr=new int[s.length()];

    for(int i=0;i<s.length();i++)
        arr[i]=s.charAt(i)-'0';

    return arr;
}

static int[] reverse(int[] arr){

    int[] rev=new int[arr.length];

    for(int i=0;i<arr.length;i++)
        rev[i]=arr[arr.length-1-i];

    return rev;
}

static boolean equal(int[] a,int[] b){

    if(a.length!=b.length)
        return false;

    for(int i=0;i<a.length;i++)
        if(a[i]!=b[i])
            return false;

    return true;
}

static boolean isDuck(int[] digits){

    for(int i=1;i<digits.length;i++)
        if(digits[i]==0)
            return true;

    return false;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int[] arr=digits(n);
    int[] rev=reverse(arr);

    System.out.println("Palindrome = "+equal(arr,rev));
    System.out.println("Duck Number = "+isDuck(arr));
}
```

}
