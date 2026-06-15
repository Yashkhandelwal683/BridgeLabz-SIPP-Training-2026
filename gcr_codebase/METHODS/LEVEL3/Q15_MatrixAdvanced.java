import java.util.*;

public class Q15_MatrixAdvanced {

```
static void display(double[][] m){

    for(double[] row:m){
        for(double x:row)
            System.out.printf("%.2f ",x);
        System.out.println();
    }
}

static double[][] transpose(double[][] a){

    double[][] t=
    new double[a[0].length][a.length];

    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            t[j][i]=a[i][j];

    return t;
}

static double determinant2x2(double[][] a){

    return a[0][0]*a[1][1]-
           a[0][1]*a[1][0];
}

static double[][] inverse2x2(double[][] a){

    double det=determinant2x2(a);

    double[][] inv={
        {a[1][1]/det,-a[0][1]/det},
        {-a[1][0]/det,a[0][0]/det}
    };

    return inv;
}

public static void main(String[] args){

    double[][] m={
        {4,7},
        {2,6}
    };

    System.out.println("Matrix");
    display(m);

    System.out.println("Transpose");
    display(transpose(m));

    System.out.println(
    "Determinant = "+determinant2x2(m));

    System.out.println("Inverse");
    display(inverse2x2(m));
}
```

}
