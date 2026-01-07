//1ST CLASS 
public class student {
    
    int grade;
    int rollnum;
    String name;

    student(int grade , int rollnum,String name){
        this.grade = grade ;
        this.rollnum = rollnum;
        this.name = name ;

    }

    void print_details(){
        System.out.println("Name of student is :"+ this.name);
        System.out.println("Rollnumber of student is : "+ this.rollnum);
        System.out.println("Grade of student is : "+ this.grade);

    }

    public static void main(String[] args) {
        student Sadhana = new student(12, 0, "sadhana");
        Sadhana.print_details();

        student suyasha = new student(1, 12, "suyasha");
        suyasha.print_details();

        student samiksha = new student(3, 1, "samiksha");
        samiksha.print_details();
        samiksha.name = "alu";
        samiksha.print_details();
        
    }
    


    
}
