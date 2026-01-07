//MULTI-LEVEL INHERITANCE EXAMPLE IN JAVA


// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Parent class
class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal sleeps");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Test class
public class second {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal
        d.sleep(); // From Mammal
        d.bark();  // From Dog
    }
}
