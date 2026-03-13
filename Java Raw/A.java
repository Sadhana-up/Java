interface Flyable {
    int max_height = 1000;
    void fly();
}

interface Swimmable {
    void swim();
}

public class A implements Flyable, Swimmable {

    public void fly(){
        System.out.println("I fly to the distance: " + max_height);
    }

    public void swim(){
        System.out.println("Splash splash, let's swim");
    }

    public static void main(String[] args) {

        A a1 = new A();
        a1.fly();
        a1.swim();

    }
}