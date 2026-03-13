import java.lang.reflect.Constructor;

public class Student {
    
//  Create a class Student with attributes: name, rollNumber, and course. Implement:

// Default constructor

// Parameterized constructor

// Constructor chaining
String name;
int rollnum;
String Course;
Student(){
    this("Sadhana","DataScience");
    


}
Student( String name , String Course){
    this(32);

}
Student(int rollnum){

}

void display(){
    System.out.println("Name is " + name + "rolll num is: " + rollnum+ "coruse is" + Course);
}

public static void main(String[] args) {
    Student s1 = new Student();
    s1.display();
}
}
