import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Name is " + name);



        System.out.println("Prnting a sentence/line");
        String a = sc.nextLine();
        System.out.println("The line is " + a);

        System.out.println("integer printing");
        int inte = sc.nextInt();
        System.out.println("The integer is " + inte);


        
        
    }
}
