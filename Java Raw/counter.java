public class counter {
    static int count = 0;
    final int max_count = 5;

    counter(){
        count ++;

    if (count>max_count){
        System.out.println("Maxm count reaches");
    }
}
public static void main(String[] args) {
    counter o = new counter();
    counter p = new counter();
    counter q = new counter();
    counter r= new counter();
    counter s = new counter();
    counter t = new counter();


}

    
}
