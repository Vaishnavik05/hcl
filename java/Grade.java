import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of student:");
        int marks = sc.nextInt();
        
        if(marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
        }
        else if(marks >= 90) {
            System.out.println("Grade: A");
        }
        else if(marks >= 75) {
            System.out.println("Grade: B");
        }
        else if(marks >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}