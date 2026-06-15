import java.util.*;

public class Q8_FriendsInfo {

```
static String findYoungest(int[] age){

    String[] names = {"Amar","Akbar","Anthony"};

    int minIndex = 0;

    for(int i=1;i<age.length;i++){
        if(age[i] < age[minIndex])
            minIndex = i;
    }

    return names[minIndex];
}

static String findTallest(double[] height){

    String[] names = {"Amar","Akbar","Anthony"};

    int maxIndex = 0;

    for(int i=1;i<height.length;i++){
        if(height[i] > height[maxIndex])
            maxIndex = i;
    }

    return names[maxIndex];
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int[] age = new int[3];
    double[] height = new double[3];

    String[] names = {"Amar","Akbar","Anthony"};

    for(int i=0;i<3;i++){

        System.out.print("Enter age of " + names[i] + ": ");
        age[i] = sc.nextInt();

        System.out.print("Enter height of " + names[i] + ": ");
        height[i] = sc.nextDouble();
    }

    System.out.println("Youngest Friend : " + findYoungest(age));
    System.out.println("Tallest Friend : " + findTallest(height));
}
#!/bin/bash

# ================= Q9 Number Analysis =================

cat > Q9_NumberAnalysis.java <<'EOF'
import java.util.*;

public class Q9_NumberAnalysis {

```
static boolean isPositive(int n){
    return n >= 0;
}

static boolean isEven(int n){
    return n % 2 == 0;
}

static int compare(int a,int b){
    if(a>b) return 1;
    if(a<b) return -1;
    return 0;
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    for(int i=0;i<5;i++){
        System.out.print("Enter Number "+(i+1)+": ");
        arr[i] = sc.nextInt();
    }

    for(int num : arr){

        if(isPositive(num)){

            if(isEven(num))
                System.out.println(num+" is Positive Even");
            else
                System.out.println(num+" is Positive Odd");
        }
        else{
            System.out.println(num+" is Negative");
        }
    }

    int result = compare(arr[0],arr[4]);

    if(result==1)
        System.out.println("First element is Greater");
    else if(result==-1)
        System.out.println("First element is Smaller");
    else
        System.out.println("Both Elements are Equal");
}
```

}
