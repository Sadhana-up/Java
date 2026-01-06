package demo2;

public class ClsA {

    private int a = 10;
    int b = 20;              // default
    protected int c = 30;
    public int d = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}


