public class Book {

    ///Create a class Book representing a real book in a library. 
    // It should have attributes: title, author, pages. 
    // Add a method displayDetails() to print book information
    // . Then create two objects of Book and call displayDetails() for each.
    String title; //instance variable 
    String author;
    int pages;
    Book(String title,String author,int pages){
        this.title = title ;
        this.author = author;
        this.pages =pages;
    }
    

    void displayDetails(){
        System.out.println("Name of the book is  " + this.title +"Author is " + this.author + "num of pages is " + this.pages );

    }

    public static void main(String[] args) {
        Book b1 = new Book("harry pott", "jk rowlong", 1000);
        b1.displayDetails();
        Book b2 = new Book("harry potter 2", null, 2000);
        b2.displayDetails();
    }
    
    
    
}
