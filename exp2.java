1. Missile Interception Percentage
import java.util.Scanner;
class MissileDefense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, intercepted, missed;
        double percentage;
        System.out.print("Enter total incoming missiles: ");
        total = sc.nextInt();
        System.out.print("Enter intercepted missiles: ");
        intercepted = sc.nextInt();
        System.out.print("Enter missed missiles: ");
        missed = sc.nextInt();
        if (total <= 0 || intercepted + missed != total) {
            System.out.println("Invalid Input");
        } else {
            percentage = (intercepted * 100.0) / total;
            System.out.printf("Interception = %.2f%%\n", percentage);
            if (percentage > 95) {
                System.out.println("Defense Status = Excellent");
            } else if (percentage >= 80) {
                System.out.println("Defense Status = Good");
            } else {
                System.out.println("Defense Status = Needs Improvement");
            }
        }
    }
}



2. Electricity Bill
import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units;
        int bill;
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
        System.out.println("Electricity Bill = Rs." + bill);
    }
}



3. Student Grade
import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        } else if (marks >= 80) {
            System.out.println("Grade = B");
        } else if (marks >= 70) {
            System.out.println("Grade = C");
        } else if (marks >= 60) {
            System.out.println("Grade = D");
        } else if (marks >= 0) {
            System.out.println("Grade = F");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}




4. Count Vowels
import java.util.Scanner;
class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        int count = 0;
        System.out.print("Enter feedback message: ");
        message = sc.nextLine();
        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels = " + count);
    }
}




5. Lab Exercise – Customer Feedback
import java.util.Scanner;
class CustomerFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customer;
        String feedback;
        String keyword;
        System.out.print("Enter customer name: ");
        customer = sc.nextLine();
        System.out.print("Enter feedback: ");
        feedback = sc.nextLine();
        System.out.print("Enter keyword: ");
        keyword = sc.nextLine();
        if (feedback.trim().isEmpty()) {
            System.out.println("Invalid Feedback Message");
            return;
        }
        int characters = feedback.length();
        String[] words = feedback.trim().split("\\s+");
        int wordCount = words.length;
        String text = feedback.toLowerCase();
        String key = keyword.toLowerCase();
        int count = 0;
        int position = 0;
        while ((position = text.indexOf(key, position)) != -1) {
            count++;
            position = position + key.length();
        }
        System.out.println("Customer = " + customer);
        System.out.println("Characters = " + characters);
        System.out.println("Words = " + wordCount);
        if (count > 0) {
            System.out.println("Keyword Found = " + count);
        } else {
            System.out.println("Keyword Not Found");
        }
    }
