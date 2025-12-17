import java.util.Scanner;

public class Exam01 {
    // public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);

    //  System.out.println("Enter your name ");
    //  String Name = sc.nextLine();

    //  System.out.println("Enter your age ");
    //  int age = sc.nextInt();

    //  System.out.println("Enter your height ");
    //  double height = sc.nextDouble();

    //  System.out.println("Name of student " + Name + "of age " + age + "has height"+ height);

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Write 3 integer separated by a space");
        String nums = sc.nextLine();

        String[] numbers = nums.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int sum = num1 + num2;

        System.out.println("Sum is " + sum );
        sc.close();


    }
        
    }

    

