
public class Main {
  public static void main(String[] args) {
    // BankAccount regular = new BankAccount("Ada", 100);
    SavingsAccount savings = new SavingsAccount("Grace", 200, .05);

    savings.applyMonthlyUpdate();

    System.out.println(savings.describe());

    BankAccount account = savings;

    System.out.println(account.describe());

    CheckingAccount check = new CheckingAccount("kelly", 10000000000.0, 10);
    BankAccount acct = check;

    BankAccount[] accounts = {
        new SavingsAccount("alex", 1.0, .05),
        new CheckingAccount("alex", 20.0, 15),
    };

    for (BankAccount a : accounts) {
      account.applyMonthlyUpdate();
    }

    // account.addInterest();

  }
}
