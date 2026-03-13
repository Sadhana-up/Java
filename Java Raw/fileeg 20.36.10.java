import java.io.File;

public class fileeg {
    public static void main(String[] args) {
        File file = new File("example.java");
        if (file.exists()){
            System.out.println("file name is " + file.getName());
             System.out.println("file paths is " + file.getAbsolutePath());
              System.out.println("file is file  is " + file.isFile());
        }
    }
}
