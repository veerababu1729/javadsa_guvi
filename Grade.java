package day1;
import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int marks = scanner.nextInt();

        if((marks>0)&(marks<=100)){
        	System.out.println("Valid");
        }
        else {
        	System.out.println("Invalid");
        }
    }
}
