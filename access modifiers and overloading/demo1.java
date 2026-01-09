//METHOD OVERLOADING WITH DIFFERENT ACCESS SPECIFIERS
public class demo1 {

   public void display() {
      System.out.println("Public method");
   }

   protected void display(int var1) {
      System.out.println("Protected method with int: " + var1);
   }

   void display(String var1) {
      System.out.println("Default method with String: " + var1);
   }

   private void display(double var1) {
      System.out.println("Private method with double: " + var1);
   }

   public static void main(String[] var0) {
      demo1 var1 = new demo1();
      var1.display();
      var1.display(10);
      var1.display("Hello");
      var1.display(5.5);
   }
}
