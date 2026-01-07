
//3RD CLASS 
public class variabledeclarationrule {
//instance variable    -> default value assign huncha
int a ;
float b ;
boolean bl;

//local variable -> default value assign hudeina 


    public static void main(String[] args){
        variabledeclarationrule v1 = new variabledeclarationrule();
        v1.a = 5;
        v1.b=12.2f;
        System.out.println("For v1 value of a is : "+ v1.a);

        variabledeclarationrule v2 = new variabledeclarationrule();
        v2.a = 60;
        v2.b = 1.1f;
        System.out.println("The value of bl in v2 is : " + v2.bl);


    }
    

  
    
    // int a = 0;
    // System.out.println("default value of local a:" + a);
    // float b ;
    // boolean bl;
}




