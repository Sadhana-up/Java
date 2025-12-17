public class variables {

    //static variable 
    static int myvar = 100;

    //Instance variable 
    String strvar = "Hello " ; //-> created everytime an instance is created

    //is bound to a method 

    void localvar(){
        int localvar = 20;
        System.out.println("Print local var is " + localvar);
    }
    public static void main(String[] args) {
        System.out.println("Static varible is " + myvar);

        variables obj = new variables();

        System.out.println("Instance variable is "+ obj.strvar );

        obj.localvar();
        
    }
    
}
