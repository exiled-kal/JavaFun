import java.util.Random;


// We are going to create a BankAccount class. 
// This class will recreate some of the common account transactions that normally occur for a bank account such as displaying your account number, 
// checking and savings amount, total amount. Of course, 
// there are also methods to invoke, such as depositing a check, 
// checking your balance, withdrawing money.



// Create a BankAccount class.
// The class should have the following attributes: (string) account number, 
// (double) checking balance, (double) savings balance
// Create a class member (static) that has the number of accounts created thus far.
// Create a class member (static) that tracks the total amount of money stored in every account created.

public class BankAccount{
    private String accountNumber; 
    private double checkingBalance; 
    private double savingsBalance; 
    private static int numberOfAccounts;
    private static double totalAmountInAccount;


// create constructor 
public BankAccount(){
    generateNewAccountNumber();
}

public String getAccountNumber(){
    return accountNumber;
}

// Create a private method that returns a random ten digit account number.
// In the constructor, call the private method from above so that each user has a random ten digit account.

private String generateNewAccountNumber(){
    String numbers = "0123456789";
    String newAccountNumber = "";

    Random rand = new Random();

    for (int i = 0; i < 5; i++){
        int num = numbers.charAt(rand.nextInt(10));
        newAccountNumber += num; 
    }
    
    accountNumber = newAccountNumber; 

    return newAccountNumber;
}


public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
}

public double getCheckingBalance(){
    System.out.println("The checking balance for this account is : $" + this.checkingBalance);
    return this.checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
}

public double getSavingsBalance(){
    System.out.println("The savings balance for this account is : $" + this.savingsBalance);
    return this.savingsBalance;

}

public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmountInAccount += checkingBalance;
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    totalAmountInAccount += savingsBalance;
}

public double total(){
    totalAmountInAccount = savingsBalance + checkingBalance;
    return totalAmountInAccount;
}

public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enought money to take out more money.");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));

    }
}

public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enought money to take out more money.");
    } 
    else{
        this.setSavingsBalance(this.getSavingsBalance() - Double.valueOf(amount));
    }

}
}