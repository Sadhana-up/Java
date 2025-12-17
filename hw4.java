public class hw4 {

    // Q5: Create a class MathOperations
    //  and overload a method multiply():

// Multiply two integers

// Multiply three integers

// Multiply two doubles
// Test all versions in main().
void multiply(int a , int b ){
    System.out.println("The product of a and b is " + (a*b));


}

void multiply(int a , int b , int c){
    System.out.println("The product of a, b and c is " + (a*b*c));

}

void multiply(double a , double b ){
    System.out.println("The product of two doubles is "+ (a*b));

}
public static void main(String[] args) {
    hw4 check = new hw4();
    check.multiply(2, 3);
    check.multiply(2.2, 3.2);
    check.multiply(1, 1, 1);
}
    
}
