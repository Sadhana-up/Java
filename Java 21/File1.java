import java.io.File;
import java.io.IOException;


public class File1 {
    public static void main(String[] args) throws IOException {
        File f = new File("example.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());

        // File f2 = new File("example.txt");
        // System.out.println(f2.exists());   

        File dir = new File("newDir");
    dir.mkdir();  // creates directory

    File f3 = new File(dir, "abc.txt");
    f3.createNewFile();  // creates file inside newDir

    System.out.println(f3.exists()); // true


        
    }

    
}
