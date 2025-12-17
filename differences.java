public class differences {

    void nonstaticmethod(){ //Calls with object creation (obj method)
        System.out.println("this is the void method ,object method "); 
    }

    static void staticMethod(){
        System.out.println("This is the static method and can be called without obj creation");


    }

    public static void main(String[] args) {
        staticMethod();

        differences obj = new differences();
        obj.nonstaticmethod();
        
    }



}
