//Access parent class variable
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println(x);       // Child's x → 20
        System.out.println(super.x); // Parent's x → 10
    }
}

public class super_example2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
