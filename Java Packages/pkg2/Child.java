package pkg2; 

import pkg1.Parent;

public class Child extends Parent {

    public void accessMembers() {
        // privateMethod(); private not accessible
        // defaultMethod(); default not accessible (different package)

        protectedMethod(); // accessible via inheritance
        publicMethod();    // always accessible

        // System.out.println(a);  private
        // System.out.println(b); default
        System.out.println(c);   //  protected
        System.out.println(d);   // public
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.accessMembers();
    }
}
