


public class BankAccount {
    
////Q15: Create a class BankAccount with:

// Fields: name (String), balance (double)

// Methods: deposit(double amount) and withdraw(double amount)

// Overload a method display() to either display account holder name or name + balance

// Use Scanner to take input from the user and demonstrate deposits and withdrawals.

// This will combine classes, objects, methods, overloading, input, and variable declaration.

    String Name;
    double balance;
    BankAccount(String Name, double balance){
        this.Name = Name;
        this.balance = 0;

}

void deposit(double amount){
    this.balance += amount;

    System.out.println("After depositing amount , total balance is "+(this.balance + amount));


}

void withdraw(double amt){
    System.out.println("After withdrawing , the amount in your bank is : " + (amt-this.balance));

}


void display(){
    System.out.println("The name of account holder is " + (this.Name));
}


public static void main(String[] args) {
  

    BankAccount b1 = new BankAccount("sadhana", 0);
    b1.deposit(2200);
    b1.withdraw(200);
}

}
