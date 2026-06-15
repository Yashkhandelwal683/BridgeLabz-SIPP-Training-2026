import java.util.Scanner;
public class Q3_TriangularPark{
static double rounds(double a,double b,double c){
return 5000.0/(a+b+c);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
System.out.println(rounds(a,b,c));
}
}
