import java.io.*;

public class File_reader_eg {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("example.txt");

            int data;

            while((data = fr.read()) != -1) {
                System.out.print((char)data);
            }

            fr.close();

        } catch(IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}