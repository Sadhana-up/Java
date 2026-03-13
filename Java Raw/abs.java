abstract class abs {
    String name;
    int numb;

    abstract void make();
    
}

class non_abs extends abs {

    @Override
    void make() {
        System.out.println("This is a non-abstract class");
    }

    public static void main(String[] args) {
        non_abs o = new non_abs();
        o.make();
    }
}