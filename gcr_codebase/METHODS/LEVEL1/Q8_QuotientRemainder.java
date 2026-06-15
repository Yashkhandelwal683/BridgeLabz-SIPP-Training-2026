import java.util.Scanner;
public class Q8_QuotientRemainder{
static int[] find(int n,int d){
return new int[]{n/d,n%d};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
int[] ans=find(n,d);
System.out.println("Quotient="+ans[0]);
System.out.println("Remainder="+ans[1]);
}
}
