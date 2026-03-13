public class BankAccount {
    private String AccountHolderName;
    private int accountNumber;
    private int balance;

    public void setAccountHolderName(String a){
        this.AccountHolderName = a;
        
    }

    public void setAccountNumber(int x){
        if(x>0){
            this.accountNumber = x;
        }
    }

    public int getAccountNumber(){
        // System.out.println("Name is " + this.accountNumber);
        return accountNumber;


    }
}

class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccountHolderName("John Doe");
        b1.setAccountNumber(123456);
        System.out.println("Account Number: " + b1.getAccountNumber());
    }
}
