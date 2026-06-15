import java.util.Scanner;
public class Q5_SpringSeason{
static boolean isSpring(int m,int d){
return (m==3&&d>=20)||(m==4)||(m==5)||(m==6&&d<=20);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int d=sc.nextInt();
System.out.println(isSpring(m,d)?"Its a Spring Season":"Not a Spring Season");
}
}
