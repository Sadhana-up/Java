package demo2;

public class ClsB {

    public static void main(String[] args) {

        ClsA obj = new ClsA();

        // System.out.println(obj.a); //  private
        System.out.println(obj.b);    // default
        System.out.println(obj.c);    //  protected
        System.out.println(obj.d);    // public

        // obj.privateMethod();       //  private
        obj.defaultMethod();          // default
        obj.protectedMethod();        // protected
        obj.publicMethod();           //  public
    }
}


