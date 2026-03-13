import java.util.Scanner;

public class switcheg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(a+b){
            case 1:
                System.out.println("It is Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}