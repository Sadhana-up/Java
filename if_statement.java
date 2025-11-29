import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The given number is ZERO ALUUUUUU");

             }

        else if(num%2==0){
            System.out.println("It is an even numberrrr YAYYY");
       

        }

        else if(num%2!=0) {
            System.out.println("It is odd");
        }

        else{
            System.out.println("SHOUT");
        }

 
        sc.close();
        
    }

    
}
