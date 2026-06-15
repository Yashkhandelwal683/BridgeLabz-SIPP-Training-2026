import java.util.Scanner;
public class Q9_ChocolateDistribution{
static int[] distribute(int c,int ch){
return new int[]{c/ch,c%ch};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int ch=sc.nextInt();
int[] ans=distribute(c,ch);
System.out.println("Each Child="+ans[0]);
System.out.println("Remaining="+ans[1]);
}
}
