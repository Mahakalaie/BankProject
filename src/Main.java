public class Main {
    public static void main(String[] args) {

        //creating a bank
        BankCustomers bank = new BankCustomers();

        //creating accounts
        SavingAccount account1 = new SavingAccount("6219-8618-0784-0001", "Mahak Alaie", 100);
        SavingAccount account2 = new SavingAccount("6219-8618-0784-0002", "Bita Mohammadi", 800);
        SavingAccount account3 = new SavingAccount("6219-8618-0784-0003", "Helena Abbasi", 50);

        TransactionAccount account4 = new TransactionAccount("6219-8618-0784-0004", "Armin Rahimi", 300);
        TransactionAccount account5 = new TransactionAccount("6219-8618-0784-0005", "Maryam Yousefi", 250);
        TransactionAccount account6 = new TransactionAccount("6219-8618-0784-0006", "Ronak Azadi", 500);

        //adding the accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);

        //finding accounts
        bank.findAccount(account2.getAccountNumber());
        bank.findAccount("6219-8618-0784-0007");

        //showing and changing balance of an account
        System.out.println(account1.getBalance());
        account1.deposit(200);
        System.out.println(account1.getBalance());
        System.out.println();

        //adding an unvalid amount to balance
        account4.deposit(-100);

        //interest of a saving account and a transactional account and showing their balances
        account3.calculateInterest();
        System.out.println();
        account5.calculateInterest();
        System.out.println();

        System.out.println(account3.getBalance());
        System.out.println(account5.getBalance());
        System.out.println();

        //withdraws from transaction accounts
        account4.withdraw(300);
        System.out.println();
        account5.withdraw(-200);
        System.out.println();
        account6.withdraw(1100);
        System.out.println();

        //withdraws from saving accounts
        account1.withdraw(100);
        System.out.println();
        account2.withdraw(-50);
        System.out.println();
        account3.withdraw(60);
        System.out.println();

        //showing the information of all accounts
        bank.showAllBalances();
    }
}