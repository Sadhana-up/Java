class Employee{
    Employee(){
        System.out.println("Employee Created");

    }



}

public class Manager extends Employee{
    Manager(){
        super();
        System.out.println("Manager cls created");

    }

    public static void main(String[] args) {
        Manager m = new Manager();
        
        
    }
    
}