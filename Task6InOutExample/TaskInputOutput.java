package Task6InOutExample;

import java.util.Scanner;

public class TaskInputOutput {
    public static void main(String args[]) {
        int a, b;

        // Create an object of the Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        // Read input from user
        a = input.nextInt();
        b = input.nextInt();
        input.close();

        // Output to user
        System.out.println("Summed together: " + (a + b));
        System.out.println("Multiplied together: " + a * b);
    }
}
