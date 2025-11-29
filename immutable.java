//2ND CLASS

public class immutable {
    public static void main(String[] args) {
        String a = "Java";
        String b = a.concat("sucks");

        System.out.println(a);
        System.out.println(b);
        a = a.toUpperCase();
        System.out.println(a);

    }
}
