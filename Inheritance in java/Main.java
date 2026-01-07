//SINGLE LEVEL INHERITANCE EXAMPLE IN JAVA
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Own method
    }
}
