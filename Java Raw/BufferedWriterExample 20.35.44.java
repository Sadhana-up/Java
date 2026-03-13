import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
   
    public static void main(String[] args) {
    try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
        bw.write("Hello i used buffered reader again hahahaha");
        bw.newLine();
        bw.write("Againn hahahah again");
        bw.close();

    }
    catch(IOException e){
        System.out.println("ec" + e);
    }
    }}

