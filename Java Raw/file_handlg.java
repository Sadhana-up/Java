import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class file_handlg {
    public static void main(String[] args) {
        try{
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream("example.txt"));
            int data;
            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }
        }
        catch(IOException e){
            System.out.println("exception occured: " + e);
        }
    }
}