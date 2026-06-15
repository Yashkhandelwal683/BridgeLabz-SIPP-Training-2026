import java.util.Scanner;
public class Q1_SimpleInterest {
static double calculateSI(double p,double r,double t){
return (p*r*t)/100;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
double r=sc.nextDouble();
double t=sc.nextDouble();
System.out.println("The Simple Interest is "+calculateSI(p,r,t));
}
}
