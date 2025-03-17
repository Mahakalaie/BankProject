public abstract class BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("The amount should be positive");
            return;
        }
        balance += amount;
        System.out.println("The amount : " + amount + "\nwas added to\nthe account number: " + accountNumber);
    }

    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("The amount should be positive");
            return;
        }

        if(balance - amount < 0)
        {
            System.out.println("The balance is not enough");
            return;
        }

        balance -= amount;
        System.out.println("The amount : " + amount + "\nwas deducted from\nthe account number: " + accountNumber);
    }

    public double getBalance()
    {
        return balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }
}
