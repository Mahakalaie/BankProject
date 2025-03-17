public class TransactionAccount extends BankAccount{

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance)
    {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest()
    {
        System.out.println("Account type : Transaction account\nNo interest for this account");
    }

    @Override
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("The amount should be positive");
            return;
        }

        if(balance + overDraftLimit - amount < 0)
        {
            System.out.println("The balance and over draft is not enough");
            return;
        }

        balance -= amount;
        System.out.println("The amount : " + amount + "\nwas deducted from\nthe account number: " + this.getAccountNumber());
    }
}
