1.File Upload and Backup
import java.io.*;
import java.util.Scanner;
class Upload extends Thread {
    String fileName;
    Upload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        File f = new File(fileName);
        if (!f.exists()) {
            System.out.println("File Not Found");
            return;
        }
        if (f.length() == 0) {
            System.out.println("Invalid File Size");
            return;
        }
        System.out.println("File Uploaded Successfully");
    }
}
class Backup implements Runnable {
    String fileName;
    Backup(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        File f = new File(fileName);
        if (!f.exists()) {
            System.out.println("File Not Found");
            return;
        }
        System.out.println("Backup Completed Successfully");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        Upload u = new Upload(fileName);
        Thread b = new Thread(new Backup(fileName));
       u.start();
        b.start();
    }
}
2.Image File Copy using Byte Stream
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter image file name: ");
        String fileName = sc.nextLine();
        try {
            FileInputStream input = new FileInputStream(fileName);
            FileOutputStream output =
                    new FileOutputStream("copy_" + fileName);
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            input.close();
            output.close();
            System.out.println("Image File Copied Successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error while copying file");
        }
    }
}


3.Text File Copy using Character Stream
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text file name: ");
        String fileName = sc.nextLine();
        try {
            FileReader input = new FileReader(fileName);
            FileWriter output =
                    new FileWriter("copy_" + fileName);
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            input.close();
            output.close();
            System.out.println("Text File Copied Successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error while copying file");
        }
    }
}


4.File Upload using Thread
import java.io.File;
import java.util.Scanner;
class FileUpload extends Thread {
    String fileName;
    FileUpload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        File f = new File(fileName);
        if (!f.exists()) {
            System.out.println("File Not Found");
            return;
        }
        if (f.length() == 0) {
            System.out.println("Invalid File Size");
            return;
        }
        System.out.println("File Uploaded Successfully");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        FileUpload f = new FileUpload(fileName);
        f.start();
    }
}



5.File Backup using Runnable
import java.io.File;
import java.util.Scanner;
class FileBackup implements Runnable {
    String fileName;
    FileBackup(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        File f = new File(fileName);
        if (!f.exists()) {
            System.out.println("File Not Found");
            return;
        }
        if (f.length() == 0) {
            System.out.println("Invalid File Size");
            return;
        }
        System.out.println("Backup Completed Successfully");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        Thread t = new Thread(new FileBackup(fileName));
        t.start();
    }
}
