// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats food");
    }
    public void play() {
        System.out.println("Dog plays fetch");
    }
}

// Test class
public class hybrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
