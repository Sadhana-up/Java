import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader_eg {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String data;
            while((data = br.readLine()) !=null){
                System.out.println(data);

            br.close();

            }
        }
        catch(IOException e){
            System.out.println("IO Exception Found");
        }
    }
    
}
