import java.util.*;

public class Q13_StudentScorecard {

```
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter Students: ");
    int n=sc.nextInt();

    int[][] marks=new int[n][3];

    for(int i=0;i<n;i++){

        marks[i][0]=(int)(Math.random()*90)+10;
        marks[i][1]=(int)(Math.random()*90)+10;
        marks[i][2]=(int)(Math.random()*90)+10;
    }

    System.out.println(
    "Phy\tChem\tMath\tTotal\tAvg\tPercent");

    for(int i=0;i<n;i++){

        int total=
        marks[i][0]+marks[i][1]+marks[i][2];

        double avg=
        Math.round((total/3.0)*100.0)/100.0;

        double percent=
        Math.round((total/300.0*100)*100.0)/100.0;

        System.out.println(
        marks[i][0]+"\t"+
        marks[i][1]+"\t"+
        marks[i][2]+"\t"+
        total+"\t"+
        avg+"\t"+
        percent);
    }
}
```

}
