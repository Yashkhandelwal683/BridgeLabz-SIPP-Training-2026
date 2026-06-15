import java.util.*;

public class Q10_CollinearPoints {

```
static boolean slopeMethod(
        int x1,int y1,
        int x2,int y2,
        int x3,int y3){

    return (y2-y1)*(x3-x2)==
           (y3-y2)*(x2-x1);
}

static boolean areaMethod(
        int x1,int y1,
        int x2,int y2,
        int x3,int y3){

    int area=
    x1*(y2-y3)+
    x2*(y3-y1)+
    x3*(y1-y2);

    return area==0;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int x1=sc.nextInt();
    int y1=sc.nextInt();

    int x2=sc.nextInt();
    int y2=sc.nextInt();

    int x3=sc.nextInt();
    int y3=sc.nextInt();

    System.out.println(
        "Slope Method = "+
        slopeMethod(x1,y1,x2,y2,x3,y3));

    System.out.println(
        "Area Method = "+
        areaMethod(x1,y1,x2,y2,x3,y3));
}

#!/bin/bash

# ================= Q11 Employee Bonus =================

cat > Q11_EmployeeBonus.java <<'EOF'
import java.util.*;

public class Q11_EmployeeBonus {

```
public static void main(String[] args){

    double totalOld=0,totalNew=0,totalBonus=0;

    double[][] emp=new double[10][2];

    for(int i=0;i<10;i++){

        emp[i][0]=(int)(Math.random()*90000)+10000;
        emp[i][1]=(int)(Math.random()*10)+1;
    }

    System.out.println("Salary\tYears\tBonus\tNewSalary");

    for(int i=0;i<10;i++){

        double salary=emp[i][0];
        double years=emp[i][1];

        double bonus=(years>5)?
                salary*0.05:
                salary*0.02;

        double newSalary=salary+bonus;

        totalOld+=salary;
        totalBonus+=bonus;
        totalNew+=newSalary;

        System.out.printf("%.0f\t%.0f\t%.2f\t%.2f%n",
                salary,years,bonus,newSalary);
    }

    System.out.println("\nTotal Old Salary = "+totalOld);
    System.out.println("Total Bonus = "+totalBonus);
    System.out.println("Total New Salary = "+totalNew);
}
```

}
