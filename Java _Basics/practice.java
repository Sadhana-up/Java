public class practice{
    // let us make all kinds of constructorsss hehehehe
    //1 . default constructor 
    String name;
    int age;

    practice(){
        System.out.println("This is the default constructor");

    }
    

    practice(String name , int age){
        System.out.println(" PARAMETRIZED Name is " + name+ "Age is " + age);
    }

    practice(String name ){
        this.name = name;
        System.out.println("Name is this constructor " + name);
        // practice.age = age;
    }

    public static void main(String[] args) {
        practice p1  = new practice();
        practice p2 = new practice("sadfhana");
        practice p3 = new practice("sadhana",21);
        
    }
}