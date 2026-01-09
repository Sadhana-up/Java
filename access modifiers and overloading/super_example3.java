//Call parent class constructor

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // calls Parent constructor
        System.out.println("Child Constructor");
    }
}

public class super_example3 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
