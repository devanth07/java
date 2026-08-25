
Q1: Reciprocal of a number with ArithmeticException

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        try {
            if (n == 0) {
                throw new ArithmeticException();
            }
            double reciprocal = 1.0 / n;
            System.out.println("Reciprocal = " + reciprocal);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        sc.close();
    }
}


Q2: Array element access with ArrayIndexOutOfBoundsException

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        try {
            int value = arr[index];
            System.out.println("Element Displayed Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
        sc.close();
    }
}


Q3: Voter eligibility using throw keyword

import java.util.Scanner;
public class Main {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid Age Exception");
        } else {
            System.out.println("Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}


Q4: Custom Exception - LowBalanceException

import java.util.Scanner;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
public class Main {
    static void checkBalance(double balance) throws LowBalanceException {
        if (balance < 1000) {
            throw new LowBalanceException("LowBalanceException");
        } else {
            System.out.println("Valid Balance");
        }
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
        sc.close();
    }
}

Lab question:
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] restaurants = new String[10];
        restaurants[0] = "A2B";
        restaurants[1] = "Barbeque Nation";
        restaurants[2] = "Empire";
        restaurants[3] = "Meghana Foods";
        restaurants[4] = "Burger King";
        int count = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Restaurants:");
        for (int i = 0; i < count; i++) {
            System.out.println(restaurants[i]);
        }
        System.out.print("Enter restaurant name to search: ");
        String key = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (restaurants[i].equalsIgnoreCase(key)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Restaurant Found");
        } else {
            System.out.println("Restaurant Not Found");
        }
        System.out.println("Total Restaurants = " + count);
        String longest = restaurants[0];
        for (int i = 1; i < count; i++) {
            if (restaurants[i].length() > longest.length()) {
                longest = restaurants[i];
            }
        }
        System.out.println("Longest Name = " + longest);

        sc.close();
    }
}
