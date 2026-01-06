import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
        System.out.println("which day is it ");

        Scanner sc = new Scanner(System.in);
        
        // test for equality against a list of values 
        String day = sc.nextLine().toLowerCase();

        switch(day){
            case "Sunday":System.out.println("It is sunday ");
            break;

            case "monday":System.out.println("It is monnday ");
            break;
            
            case "tuesday":System.out.println("It is tuesday ");
            break;

            case "Wednesday":System.out.println("It is wednesday ");
            break;

            case "Thursday":System.out.println("It is Thursday ");
            break;

            case "Friday":System.out.println("It is Friday ");
            break;

              case "saturday":System.out.println("It is saturday ");
            break;
        
            
            
            

        }
    }

    
}
