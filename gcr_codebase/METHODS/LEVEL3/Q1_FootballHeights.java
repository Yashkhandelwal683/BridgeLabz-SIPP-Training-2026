import java.util.*;

public class Q1_FootballHeights {

```
static int sum(int[] arr){
    int sum=0;
    for(int x:arr) sum+=x;
    return sum;
}

static double mean(int[] arr){
    return (double)sum(arr)/arr.length;
}

static int shortest(int[] arr){
    int min=arr[0];
    for(int x:arr) min=Math.min(min,x);
    return min;
}

static int tallest(int[] arr){
    int max=arr[0];
    for(int x:arr) max=Math.max(max,x);
    return max;
}

public static void main(String[] args){

    int[] heights=new int[11];

    for(int i=0;i<11;i++)
        heights[i]=(int)(Math.random()*101)+150;

    System.out.println("Heights:");
    for(int h:heights)
        System.out.print(h+" ");

    System.out.println("\nMean Height = "+mean(heights));
    System.out.println("Shortest = "+shortest(heights));
    System.out.println("Tallest = "+tallest(heights));
}
```

}
