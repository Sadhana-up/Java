abstract class abstract_cls_demo {
    abstract void display();

  
}
class football extends abstract_cls_demo {
    void display() {
        System.out.println("Football is a popular sport."); //method chei use garnu prxa / implement grnu prxa
    }


}

class cricket extends abstract_cls_demo {
    void display(){
        System.out.println("hi i like cricket");

    }

    
}

public class main_cls {
    public static void main(String[] args) {
        football f = new football();
        cricket c = new cricket();
        f.display();
        c.display();
       
    }

    
}