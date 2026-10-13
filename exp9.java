1. Employee Details Using ArrayList
import java.util.*;

class Employee {
    String id, name;
    double salary;

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (salary <= 0) {
                System.out.println("Invalid Salary");
            } else {
                list.add(new Employee(id, name, salary));
                System.out.println("Employee Record Added");
            }
        }

        System.out.println("Employee Details Displayed");
        for (Employee e : list) {
            e.display();
        }
        sc.close();
    }
}


2. Sort Employee Names in Ascending Order
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        if (names.isEmpty()) {
            System.out.println("No Employee Records");
        } else {
            Collections.sort(names);

            if (names.size() == 1) {
                System.out.println("Same Employee Displayed");
            } else {
                for (String name : names) {
                    System.out.print(name + " ");
                }
            }
        }
        sc.close();
    }
}



3. Sort Employee Salaries in Descending Order
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double salary = sc.nextDouble();

            if (salary <= 0) {
                System.out.println("Invalid Salary");
                sc.close();
                return;
            }

            salaries.add(salary);
        }

        Collections.sort(salaries, Collections.reverseOrder());

        if (salaries.size() == 1) {
            System.out.println("Same Salary Displayed");
        } else {
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        sc.close();
    }
}

4. Sort Employee Records Using Lambda Expressions

import java.util.*;

class Employee {
    String id, name;
    double salary;

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (salary <= 0) {
                System.out.println("Invalid Salary");
                sc.close();
                return;
            }

            list.add(new Employee(id, name, salary));
        }

        list.sort((e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("Sorted Employee Records Displayed");
        for (Employee e : list) {
            e.display();
        }

        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("Records Sorted by Salary in Descending Order");
        for (Employee e : list) {
            e.display();
        }

        sc.close();
    }
}
