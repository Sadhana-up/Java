public class Student {
    
    String name;
    int rollNo;
    double marks;

    Student(){
        System.out.println("Default Constructor");

    }

    Student ( String n , int r , double m){
        this.name = n;
        this.rollNo = r;
        this.marks = m;
        System.out.println("Parametrized cons");

    }
Student(String n , int r){
    this.name = n;
    this.rollNo = r;
    this.marks = 0;


}

public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("sadhana", 21);
    Student s3 = new Student("cutie", 1, 20.00);

}
    

}
