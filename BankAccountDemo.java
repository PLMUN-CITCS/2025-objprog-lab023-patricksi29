public class BankAccountDemo {
    public static void main(String[] args) {
        // Step 6: Create a BankAccount object
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Step 7: Perform transactions using methods
        myAccount.deposit(250.0);  // Deposit $250 into the account
        myAccount.withdraw(100.0); // Withdraw $100 from the account

        // Step 8: Print account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
