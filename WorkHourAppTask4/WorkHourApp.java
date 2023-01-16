package WorkHourAppTask4;

import java.util.Scanner;

public class WorkHourApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many hours per day:");
        int hoursperday = input.nextInt();

        System.out.println("Enter how many days:");
        int numdays = input.nextInt();

        int totalhours = 0;
        for (int i = 0; i < numdays; i++) {
            totalhours += hoursperday;
        }

        System.out.println("Total hours worked: " + totalhours);
    }
}
