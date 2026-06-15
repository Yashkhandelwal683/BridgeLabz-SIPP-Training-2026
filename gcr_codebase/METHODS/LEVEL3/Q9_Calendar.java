import java.util.*;

public class Q9_Calendar {

```
static boolean leapYear(int year){
    return (year%4==0 && year%100!=0) || (year%400==0);
}

static int daysInMonth(int month,int year){

    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

    if(month==2 && leapYear(year))
        return 29;

    return days[month-1];
}

static int firstDay(int month,int year){

    int q=1;

    if(month<3){
        month+=12;
        year--;
    }

    int k=year%100;
    int j=year/100;

    int h=(q+(13*(month+1))/5+k+k/4+j/4+5*j)%7;

    return (h+6)%7;
}

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    int month=sc.nextInt();
    int year=sc.nextInt();

    String[] months={
        "January","February","March","April",
        "May","June","July","August",
        "September","October","November","December"
    };

    System.out.println("\n"+months[month-1]+" "+year);
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    int start=firstDay(month,year);

    for(int i=0;i<start;i++)
        System.out.print("    ");

    int days=daysInMonth(month,year);

    for(int d=1;d<=days;d++){

        System.out.printf("%4d",d);

        if((start+d)%7==0)
            System.out.println();
    }
}
```

}
