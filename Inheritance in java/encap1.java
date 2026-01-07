class enc{
    private int age; // inst variable
    String name =" Sadhana ";
// should be able to access them but not directly 

// access with help of methods 
public int getAge() {
    return age;


}

public void setAge(int a) {
    this.age = a;
}
}


public class encap1{
    public static void main(String[] args) {
        enc obj = new enc();
        obj.setAge(50);
        System.out.println("Name: " + obj.name + ", Age: " + obj.getAge());
    }
}
