import java.util.*;

public class Q11_Quadratic {

```
static double[] findRoots(double a,double b,double c){

    double delta = b*b - 4*a*c;

    if(delta < 0)
        return new double[0];

    if(delta == 0){

        double root = -b/(2*a);
        return new double[]{root};
    }

    double root1 =
        (-b + Math.sqrt(delta))/(2*a);

    double root2 =
        (-b - Math.sqrt(delta))/(2*a);

    return new double[]{root1,root2};
}

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    double a = sc.nextDouble();

    System.out.print("Enter b: ");
    double b = sc.nextDouble();

    System.out.print("Enter c: ");
    double c = sc.nextDouble();

    double[] roots = findRoots(a,b,c);

    if(roots.length==0){
        System.out.println("No Real Roots");
    }
    else if(roots.length==1){
        System.out.println("Root = "+roots[0]);
    }
    else{
        System.out.println("Root1 = "+roots[0]);
        System.out.println("Root2 = "+roots[1]);
    }
}
```

}
