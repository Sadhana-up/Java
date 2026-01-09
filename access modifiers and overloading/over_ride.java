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

public class over_ride {
    public static void main(String[] args) {
        Parent obj = new Child();  
        obj.show();  //Run time polymorphism             
    }
}




/*Reference type: Parent
Compiler sees obj as a Parent object → so it checks: “Does Parent have a show() method?”
  YES. Compilation is okay.

Actual object type: Child
At runtime, JVM sees the actual object is Child → it will call the Child’s overridden show() method. */

/* Why is it called runtime polymorphism?
Compiler cannot decide which show() to call
Decision is made while program is running
 */
