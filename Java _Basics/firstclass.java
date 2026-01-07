public class firstclass {

    String Name;
    int roll;
    float grade;

    public static void main(String[] args) {
        firstclass ram = new firstclass();
        ram.grade = 3.5f;
        ram.Name = "ram";
        ram.roll = 11;

        System.out.println("Name of student is: " + ram.Name);
        System.out.println("Roll number of student is " + ram.roll);
        System.out.println("Student reads in " + ram.grade);
    }
}

class refree {

    String Name;
    int refree_id;
    float height;
    String gender;

    public static void main(String[] args) {

        // Define player class before using it
        player numberone = new player();

        numberone.Name = "bunty";
        numberone.height = 12.2f;
        numberone.gender = "transgender";

        System.out.println("Name of player is " + numberone.Name);
        System.out.println("Height of player is " + numberone.height);
        System.out.println("Gender of player is " + numberone.gender);
        System.out.println("Player id is " + numberone.player_id);
    }
}

class player {
    String Name;
    int player_id;
    float height;
    String gender;
}
