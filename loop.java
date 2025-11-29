public class loop {

    // Non-static method
    void printLoop() {
        for (int i = 0; i < 3; i++) {
            System.out.println("JAVA");
        }
    }

    // Static method
    static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Calling non-static method → need object
        loop obj = new loop();
        obj.printLoop();

        // 2. Calling static method → no object needed
        printStars(5);
    }
}
