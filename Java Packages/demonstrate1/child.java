package demonstrate1;

public class child extends parent {

    public void accessMembers() {

        // System.out.println(a); //  private
        System.out.println(b);    // default
        System.out.println(c);    // protected
        System.out.println(d);    //  public

        // privateMethod();       //  private
        defaultMethod();          //  default
        protectedMethod();        // protected
        publicMethod();           // public
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.accessMembers();
    }
}
