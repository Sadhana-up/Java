public class Book {
    String title;
    double price;
    String author;

    Book(String t , String a , double p){
        this.title =t;
        this.price = p;
        this.author =a;}

    public void display_details(){
        System.out.println("Book name" + this.title +"author:" +this.author + "price" + this.price);



        
    }
    public static void main(String[] args) {
        Book b1 = new Book("humpy ki dumpty","sadhana great",6.667);
        b1.display_details();
    }
    
}
