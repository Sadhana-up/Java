//If a child overrides a method, you can still call the parent’s version using super.

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show();  // calls Parent's method
        System.out.println("Child method");
    }
}

public class super_example1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
