1. Product Class
import java.util.*;
class Product {
    String productId;
    String productName;
    double price;
    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    void display() {
        if (price <= 0)
            System.out.println("Invalid Product Price");
        else {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        Product p = new Product(id, name, price);
        p.display();
    }
}


2. Method Overloading — Price Calculator
import java.util.*
class PriceCalculator {
    void calculate(double price) {
        if (price <= 0)
            System.out.println("Invalid Product Price");
        else
            System.out.println("Original Price = " + price);
    }
    void calculate(double price, double discount) {
        if (price <= 0)
            System.out.println("Invalid Product Price");
        else if (discount < 0 || discount > 100)
            System.out.println("Invalid Discount");
        else {
            double finalPrice = price - (price * discount / 100);
            System.out.println("Final Price = " + finalPrice);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble();
        PriceCalculator p = new PriceCalculator();
        p.calculate(price);
        p.calculate(price, discount);
    }
}
3. Inheritance + Method Overriding
import java.util.*;
class Product {
    String productId;
    String productName;
    double price;
    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    void displayCategory() {
        System.out.println("Product");
    }
}
class Electronics extends Product {
    Electronics(String id, String name, double price) {
        super(id, name, price);
    }
    void displayCategory() {
        System.out.println("Electronics Product Displayed");
    }
}
class HomeAppliance extends Product {
    HomeAppliance(String id, String name, double price) {
        super(id, name, price);
    }
    void displayCategory() {
        System.out.println("Home Appliance Product Displayed");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category = sc.nextLine();
        String id = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        if (price <= 0) {
            System.out.println("Invalid Product Price");
            return;
        }
        Product p;
        if (category.equalsIgnoreCase("Electronics"))
            p = new Electronics(id, name, price);
        else if (category.equalsIgnoreCase("Home Appliance"))
            p = new HomeAppliance(id, name, price);
        else {
            System.out.println("Invalid Product Category");
            return;
        }
        p.displayCategory();
    }
}


4. Interface — Payment
import java.util.*;
interface Payment {
    void pay();
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}
class DebitCard implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}
class NetBanking implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.nextLine();
        Payment p;
        if (mode.equalsIgnoreCase("UPI"))
            p = new UPI();
        else if (mode.equalsIgnoreCase("Credit Card"))
            p = new CreditCard();
        else if (mode.equalsIgnoreCase("Debit Card"))
            p = new DebitCard();
        else if (mode.equalsIgnoreCase("Net Banking"))
            p = new NetBanking();
        else {
            System.out.println("Invalid Payment Mode");
            return;
        }
        p.pay();
    }
}
