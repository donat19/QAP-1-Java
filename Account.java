/**
 * The Account class represents a bank account with a balance
 * and methods to manage transactions.
 */
public class Account {
    // Instance variables
    private double balance;
    
    /**
     * Constructor to initialize account with a specific balance
     * @param initialBalance the starting balance for the account
     */
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    
    /**
     * Gets the current account balance
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Deposits an amount into the account
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    /**
     * Withdraws an amount from the account
     * @param amount the amount to withdraw
     * @return true if successful, false if insufficient funds
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    /**
     * Transfers an amount from this account to another account
     * @param toAccount the account to transfer to
     * @param amount the amount to transfer
     * @return true if successful, false if insufficient funds
     */
    public boolean transfer(Account toAccount, double amount) {
        if (withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
