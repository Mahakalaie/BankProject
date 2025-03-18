import java.util.ArrayList;

public class BankCustomers {

    private ArrayList<BankAccount> accountsList;

    public BankCustomers()
    {
        accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account)
    {
        accountsList.add(account);
    }

    public void showAllBalances()
    {
        for(BankAccount bankAccount : accountsList)
        {
            System.out.println("Name of account holder : " + bankAccount.getAccountHolderName());
            System.out.println("Account number : " + bankAccount.getAccountNumber());
            System.out.println("Account Balance : " + bankAccount.getBalance());
            System.out.println("----------");
        }
    }

    public BankAccount findAccount(String accountNumber)
    {
        for(BankAccount bankAccount : accountsList)
        {
            if(bankAccount.getAccountNumber() != accountNumber)
                continue;

            System.out.println("Name of account holder : " + bankAccount.getAccountHolderName());
            System.out.println("Account number : " + bankAccount.getAccountNumber());
            System.out.println("Account Balance : " + bankAccount.getBalance());
            System.out.println();
            return bankAccount;
        }

        System.out.println("There is no account with this number\n");
        return null;
    }
}
