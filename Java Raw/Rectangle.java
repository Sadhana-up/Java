public class Rectangle {
    
    int length;
    int breadth;

    Rectangle(){
        this(21, 1);
        System.out.println("Default cons");

    }

    Rectangle(int l , int b){
        this.length = l;
        this.breadth = b;
    }

    void area(){
        int ar = this.length * this.breadth;
        System.out.println("area is :" + ar);

    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
    }
}
