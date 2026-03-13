import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fs = new FileOutputStream("example.txt");
            String data = " Hello , this is what u added to example.txt file";
            fs.write(data.getBytes());
            fs.close();
        }

        catch(IOException e){
            System.out.println("Execpetion occured"+ e);
        }
        
    }
    
}
