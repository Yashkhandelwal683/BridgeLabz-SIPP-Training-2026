import java.util.Scanner;
public class Q7_SmallestLargest{
static int[] find(int a,int b,int c){
int small=Math.min(a,Math.min(b,c));
int large=Math.max(a,Math.max(b,c));
return new int[]{small,large};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int[] ans=find(a,b,c);
System.out.println("Smallest="+ans[0]);
System.out.println("Largest="+ans[1]);
}
}
