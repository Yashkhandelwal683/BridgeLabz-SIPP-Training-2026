import java.util.*;

class InsufficientBalanceException
extends Exception{

```
public InsufficientBalanceException(
        String msg){
    super(msg);
}
```

}

class BankAccount{

```
private double balance;

public BankAccount(double balance){
    this.balance = balance;
}

public void withdraw(double amount)
throws InsufficientBalanceException{

    if(amount < 0){
        throw new IllegalArgumentException(
                "Invalid amount!");
    }

    if(amount > balance){
        throw new InsufficientBalanceException(
                "Insufficient balance!");
    }

    balance -= amount;

    System.out.println(
    "Withdrawal successful, new balance: "
    + balance);
}
```

}

public class Q10_BankTransaction {

```
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    BankAccount account =
            new BankAccount(10000);

    try{

        System.out.print(
                "Enter amount: ");

        double amount =
                sc.nextDouble();

        account.withdraw(amount);

    }
    catch(
    InsufficientBalanceException e){

        System.out.println(
                e.getMessage());
    }
    catch(
    IllegalArgumentException e){

        System.out.println(
                e.getMessage());
    }
}
```

}
