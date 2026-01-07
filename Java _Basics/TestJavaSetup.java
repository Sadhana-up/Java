import java.util.Scanner;

public class TestJavaSetup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.println("Welcome! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Let's do a simple addition.");

        // Simple addition
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
