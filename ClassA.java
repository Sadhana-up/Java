public class ClassA {
    int roll;
    public float grade;
    protected int phn;
    private String name;

    void setdata(int r , float g , int p , String n){
        this.roll = r;
        this.grade = g;
        this.phn = p;
        this.name = n;
    }

    void display_data(){
        System.out.println("Name is " + this.name + " Rolln is " + this.roll + " studies in " + this.grade + " Phonenum is " + this.phn);
    } 
    }



    

