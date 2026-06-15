import java.util.*;

public class Q8_OTPGenerator {

```
static int generateOTP(){
    return (int)(Math.random()*900000)+100000;
}

static boolean unique(int[] arr){

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
                return false;
        }
    }
    return true;
}

public static void main(String[] args){

    int[] otp=new int[10];

    for(int i=0;i<10;i++){
        otp[i]=generateOTP();
        System.out.println("OTP "+(i+1)+" : "+otp[i]);
    }

    System.out.println("All Unique = "+unique(otp));
}
```

}
