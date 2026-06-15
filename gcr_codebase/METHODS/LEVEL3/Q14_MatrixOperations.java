import java.util.*;

public class Q14_MatrixOperations {

```
static int[][] randomMatrix(int r,int c){

    int[][] m=new int[r][c];

    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            m[i][j]=(int)(Math.random()*10);

    return m;
}

static int[][] add(int[][] a,int[][] b){

    int[][] res=new int[a.length][a[0].length];

    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            res[i][j]=a[i][j]+b[i][j];

    return res;
}

static int[][] subtract(int[][] a,int[][] b){

    int[][] res=new int[a.length][a[0].length];

    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            res[i][j]=a[i][j]-b[i][j];

    return res;
}

static int[][] multiply(int[][] a,int[][] b){

    int[][] res=new int[a.length][b[0].length];

    for(int i=0;i<a.length;i++)
        for(int j=0;j<b[0].length;j++)
            for(int k=0;k<b.length;k++)
                res[i][j]+=a[i][k]*b[k][j];

    return res;
}

static void display(int[][] m){

    for(int[] row:m){
        for(int x:row)
            System.out.print(x+" ");
        System.out.println();
    }
}

public static void main(String[] args){

    int[][] a=randomMatrix(3,3);
    int[][] b=randomMatrix(3,3);

    System.out.println("Matrix A");
    display(a);

    System.out.println("Matrix B");
    display(b);

    System.out.println("Addition");
    display(add(a,b));

    System.out.println("Subtraction");
    display(subtract(a,b));

    System.out.println("Multiplication");
    display(multiply(a,b));
}
```

}
