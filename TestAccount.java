/**
 * Test class for the Account class.
 * Creates two accounts and demonstrates balance retrieval and transfers.
 */
public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts with initial balances
        Account acc1 = new Account(5000.0);
        Account acc2 = new Account(4000.0);
        
        // Print initial balances
        System.out.println("Initial balances:");
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());
        
        // Transfer $1000 from acc1 to acc2
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        acc1.transfer(acc2, 1000.0);
        
        // Print updated balances
        System.out.println("\nFinal balances after transfer:");
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());
    }
}
