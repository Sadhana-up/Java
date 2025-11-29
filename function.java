//3RD CLASS

public class function {

    

    void sumnum(){
        int a = 100;
        int b = 200;
        int sum = a+b ;
        System.out.println("sum is " + sum);

    }
    void sumdiffnum(int a, int b ,int c ){
        int sum = a+b ;
        System.out.println("sum"+sum);
    }

    int sumnumreturn(int c, int d) {
        return c + d;
    }

    public static void main(String[] args) {
        function f = new function();
        f.sumnum();
        // int result = sumnumreturn(5, 10);
        // System.out.println("Sum = " + result);
    }
}
