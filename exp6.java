1 — HDFC Bank Withdrawal
import java.util.Scanner;
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String msg) {
        super(msg);
    }
}
class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount)
            throws InvalidAmountException,
            InsufficientBalanceException,
            DailyLimitExceededException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid Amount");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        if (amount > 20000)
            throw new DailyLimitExceededException("Daily Limit Exceeded");
        balance = balance - amount;
        System.out.println("Transaction Successful");
        System.out.println("Remaining Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();
        BankAccount b = new BankAccount(balance);
        try {
            b.withdraw(amount);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}

2.Reciprocal
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            double result = 1.0 / n;
            System.out.println("Reciprocal = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}

3.Array Index
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element = " + a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}

4.Voter Eligibility
import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class Main {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Invalid Age");\
      System.out.println("Eligible to Vote");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


5.Low Balance Exception
import java.util.Scanner;
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}
public class Main {
    static void checkBalance(double balance)
            throws LowBalanceException {
        if (balance < 1000)
            throw new LowBalanceException("Low Balance");
        System.out.println("Valid Balance");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        try {
            checkBalance(balance);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
