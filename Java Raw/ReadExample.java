import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("example.txt");

            int data;

            while((data = fis.read()) != -1) {
                System.out.print((char)data);
            }

            fis.close();

        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
} 
