package day1;
import java.util.Scanner;

public class PerfectSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Compute square root
        int sqrt = (int)Math.sqrt(number);

        // Check if square of sqrt equals the number
        if (sqrt * sqrt == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }
}
