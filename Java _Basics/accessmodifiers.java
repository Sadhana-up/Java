class accessmodifiers { // access resources from a class be it public , private or protected  //class is either default or public 
    //package : same type of classes are confined within a package , same name of classes cant be added 
    //same class ma j ni access garna milxa 
    //same folder ma vako chei  samepackage subclass 
    // 
    int roll; //default 
    public String name;
    private int bankacc;
    protected char gender ;
    void setdata(int roll , String  name , int bankacc , char gender ){
        this.roll = roll ;
        this.name = name ;
        this.bankacc = bankacc;
        this.gender = gender ;
     }

    void getdata(){
        System.out.println("Name"+this.name);
        System.out.println("Roll" + this.roll);
        System.out.println("Bank acc is " + this.bankacc);
        System.out.println("Gender is " + this.gender);


    
    

    }

    // public static void main(String[] args) {
    //     accessmodifiers a1 = new accessmodifiers();
    //     a1.setdata(12, "Sadhana", 1234, 'f');
    //     a1.getdata();
    // }


class Testaccessmodifier{
    public static void main(String[] args) {
        accessmodifiers a1 = new accessmodifiers();
        a1.setdata(12, "bunty ", 1234, 'f');
        a1.getdata();
        // a1.bankacc() mildena cause itis private in the previous
        
    }
}
    
    
    
     }


