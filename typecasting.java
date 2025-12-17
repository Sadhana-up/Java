public class typecasting {
    //Two types of typecasting in java 
    //1. Implicit -- Widening byte->short->int->long->float->double 
    public static void main(String[] args) {
        int a = 20;
        double b = a;

    
        System.out.println("type casted "+ b );

    // Explicit type casting or narrowing : 
        double num = 66.66; //Round off hudeina so the part after. the decimal point id disregarded
        int changed = (int) num;
        System.out.println("The dtype has been explicitly changed" + changed);
    }
    

}
