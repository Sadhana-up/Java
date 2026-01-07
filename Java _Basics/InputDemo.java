//2ND CLASS

import java.util.Scanner; //extracts various classes 

class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Roll: ");
        int roll = Integer.parseInt(sc.nextLine());
        //int roll = sc.nextInt();
        //sc.nextline 10 gayera bascha which is the ascii value of enter  

        System.out.print("Name: ");
        String name = sc.nextLine(); //cleaning the buffer 

        System.out.print("CGPA: ");
        double cgpa = Double.parseDouble(sc.nextLine());

        System.out.println("\n--- Student Info ---");
        System.out.printf("Roll: %d\nName: %s\nCGPA: %.2f\n", roll, name, cgpa);

        sc.close();
    }
}
