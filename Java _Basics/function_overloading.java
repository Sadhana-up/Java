//3RD CLASS 


public class function_overloading {
    void add(){
        int a = 55;
        int b = 55;
        int sum = a+b;

        System.out.println("The sum is :" + sum);

    }

    void add(int a ){
        int b = 55;
        int sum = a +b;
        System.out.println("sum is : "+ sum );
    }

    void add(int a , int b ){
    int sum  = a+b;
    System.out.println("sum is : "+ sum );


}

    void add(float f){
        System.out.println("Value is :" + f);

    }

public static void main(String[] args) {
    function_overloading fd = new function_overloading();
    fd.add(0);

// function overloading ma aru j huda ni huncha but paramter should be slightly changed 

}
}
