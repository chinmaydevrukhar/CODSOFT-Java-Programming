class BankAccount{
    private double balance;
    
    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount == 0){
            System.out.println("Transaction invalid!! Enter appropriate amount.");
        }else{
        balance += amount;
        System.out.println("The Deposit is succesful.\nThe deposited amount is: "+amount);
        System.out.println("The new balance is: "+balance);
        }
    }

    public void withdraw(double amount){
        if(amount > balance || amount ==0 ){
            System.out.println("Withdrawal amount invalid or Insufficient balance");
        }else{
            balance -= amount;
        System.out.println("The Withdrawal is succesful.\nThe deposited amount is: "+amount);
        System.out.println("The new balance is: "+balance);
        }
    }

}

class ATM{
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void checkBalance() {
        System.out.println("Your account balance: " + userAccount.getBalance());
    }
}

public class ATMinterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atmMachine = new ATM(userAccount);

        atmMachine.withdraw(200); 
        atmMachine.deposit(300);  
        atmMachine.checkBalance();
    }
}
