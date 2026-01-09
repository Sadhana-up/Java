class Parent {
    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class method");
    }
}

public class override_simple {
    public static void main(String[] args) {
        Child obj = new Child();  // Child object and reference
        obj.show();               // Calls Child's overridden method
    }
}

// Decided at compile time:
 // Reference type: Child
 // Compiler sees obj as a Child object → so it checks: “Does Child have a show() method?”
 //  YES. Compilation is okay.

 // Decided at runtime:
 // Actual object type: Child
 // At runtime, JVM sees the actual object is Child → it will call the Child’s overridden show() method.
