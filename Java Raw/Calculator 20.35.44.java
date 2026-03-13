class Calculator {
    static int square(int num) { // static method
        return num * num;
    }



    public static void main(String[] args) {
        // Accessing static method without creating object
        
        System.out.println("Square: " + Calculator.square(3));
    }
}