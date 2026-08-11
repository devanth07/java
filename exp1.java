Q1. Student Grades Program
import java.util.Scanner;
public class Q1_StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        char[] grades = new char[n];
        int a=0,b=0,c=0,d=0,f=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
            if (marks[i] >= 90) { grades[i]='A'; a++; }
            else if (marks[i] >= 80) { grades[i]='B'; b++; }
            else if (marks[i] >= 70) { grades[i]='C'; c++; }
            else if (marks[i] >= 60) { grades[i]='D'; d++; }
            else { grades[i]='F'; f++; }
        }

        System.out.print("Grades: ");
        for (int i = 0; i < n; i++) System.out.print(grades[i] + " ");
        System.out.println();
        System.out.println("A=" + a + ", B=" + b + ", C=" + c + ", D=" + d + ", F=" + f);
        double avg = (double) sum / n;
        System.out.printf("Average = %.1f%n", avg);
    }
}


Q2. Second Largest Distinct Element
import java.util.Scanner;
public class Q2_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second Largest = " + second);
        }
    }
}


Q3. Two Sum
import java.util.Scanner;
public class Q3_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < n && idx1 == -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }
        System.out.println("[" + idx1 + "," + idx2 + "]");
    }
}


Q4. Maximum Subarray Sum
import java.util.Scanner;
public class Q4_MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Output: " + maxSum);
    }
}


