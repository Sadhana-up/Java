public class encapsulation {
    private int accno;
    private int balance;

    encapsulation(int a , int b){
        this.accno = a;
        this.balance = b;

    }

    void deposit(int amount){
        this.balance = this.balance + amount;
    }

    void witdraw(int amount){
        this.balance = this.balance - amount;

    }

    public int set_balance(){
        if (this.balance>0){
            return this.balance;

        }
    }
}
