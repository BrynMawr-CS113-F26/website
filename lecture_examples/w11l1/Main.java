public class Main {
  public static void main(String[] args) {
    BankAccount regular = new BankAccount("Ada", 100);
    SavingsAccount savings = new SavingsAccount("Grace", 200, .05);

    regular.deposit(20);
    savings.deposit(20);
    savings.addInterest();

    System.out.println(regular.describe());
    System.out.println(savings.describe());

    BankAccount account = savings;

    System.out.println(account.describe());

    // account.addInterest();

  }
}
