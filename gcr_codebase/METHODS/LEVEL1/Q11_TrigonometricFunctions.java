import java.util.Scanner;
public class Q11_TrigonometricFunctions{
static double[] calculate(double angle){
double r=Math.toRadians(angle);
return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double angle=sc.nextDouble();
double[] ans=calculate(angle);
System.out.println("Sin="+ans[0]);
System.out.println("Cos="+ans[1]);
System.out.println("Tan="+ans[2]);
}
}
