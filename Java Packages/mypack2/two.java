package mypack2;
import mypack1.one;

public class two {


    public static void main(String[] args) {

        one obj = new one();

        // System.out.println(obj.a); //  private → NOT accessible
        // System.out.println(obj.b); // default → NOT accessible
        // System.out.println(obj.c); // protected → NOT accessible (no inheritance)
        System.out.println(obj.d);     // public → accessible

        // obj.privateMethod();   // private
        // obj.defaultMethod();   // default
        // obj.protectedMethod(); // protected
        obj.publicMethod();        // public
    }
}

  


    

