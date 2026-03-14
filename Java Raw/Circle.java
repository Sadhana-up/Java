import java.util.Scanner;

class Shape {

    void area(){
        System.out.println("Area not found");
    }
    

}

public class Circle extends Shape{
    @Override
    void area(){
       int ar = 3 * 12;
       System.out.println("area is :" + ar);
    }
public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.area();
    Shape c2 = new Shape();
    c2.area();
}
}
