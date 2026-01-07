public class Car {  // Public class
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    void displayDetails(){
        System.out.println("The model of car is " + this.model + " and the year is " + this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 1990);
        car1.displayDetails();

        Student s1 = new Student("Sadhana", 60);
        s1.isPass();
    }
}

class Student {   // Non-public
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void isPass(){
        if (this.marks >= 40){
            System.out.println(name + " Passed");
        } else {
            System.out.println(name + " Not Passed");
        }
    }
}
