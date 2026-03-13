class Book{
    String title;
    int price;
    Book(String title , int price){
        this.title = title ;
        this.price = price ; 


    }

    void show_details(){
        System.out.println("The title of the book is " + this.title +" and price is " + this.price);

    }

    public static void main(String[] args) {
        Book b1 = new Book("i suck so much", 200);
        b1.show_details();
    }
}