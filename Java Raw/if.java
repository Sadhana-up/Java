interface A{
    String location = " ktm "; // by default it is public static final
    void display(); //. is abstract method by default
}

class B implements A{

    public void display() {
        System.out.println("This is a class that implements interface A");
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}