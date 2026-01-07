//2ND CLASS

public class primitive_dtype {


    public static void main(String[] args) {

        // byte: 1 byte, small integers
        byte age = 20;
        System.out.println("Byte value (age): " + age);

        // short: 2 bytes, slightly bigger integers
        short population = 1500;
        System.out.println("Short value (population): " + population);

        // int: 4 bytes, commonly used for integers
        int salary = 50000;
        System.out.println("Int value (salary): " + salary);

        // long: 8 bytes, large integers
        long worldPopulation = 8000000000L; // must end with 'L'
        System.out.println("Long value (world population): " + worldPopulation);

        // float: 4 bytes, decimal numbers (single precision)
        float temperature = 36.6f; // must end with 'f'
        System.out.println("Float value (temperature): " + temperature);

        // double: 8 bytes, decimal numbers (double precision)
        double price = 999.99;
        System.out.println("Double value (price): " + price);

        // char: 2 bytes, stores a single character
        char grade = 'A';
        System.out.println("Char value (grade): " + grade);

        // boolean: stores true or false
        boolean isStudent = true;
        System.out.println("Boolean value (is student): " + isStudent);
    }
}


