import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    
    public static void main(String[] args) {
        try{
        FileWriter fw =  new FileWriter("example.txt");
        int data;
        fw.write("i added this line using filewriter");
        fw.close();
        }
    catch(IOException e){
        System.out.println("exception" + e );

    }}
}
