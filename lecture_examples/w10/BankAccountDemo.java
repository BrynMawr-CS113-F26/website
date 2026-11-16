public class BankAccountDemo {
  public static void main(String[] args) {

    BankAccount[] accounts = new BankAccount[3];
    accounts[0] = new BankAccount("kelly", 100.0);
    accounts[1] = new BankAccount("milo", 99.0);
    accounts[2] = new BankAccount("alex", 1000.0);

    System.out.println(accounts[0].getOwner());

    for (int i = 0; i < accounts.length; i++) {
      System.out.println(accounts[i].getOwner() + ": $" + accounts[i].getBalance());
    }

    for (BankAccount account : accounts) {
      System.out.println(account.getOwner() + ": $" + account.getBalance());
    }

    System.out.println(totalBalance(accounts));

  }

  public static double totalBalance(BankAccount[] accounts) {
    int total = 0;

    for (BankAccount account : accounts) {
      total += account.getBalance();
    }

    return total;
  }

  public static BankAccount richestAccount(BankAccount[] accounts) {
    if (accounts.length == 0) {
      return null;
    }

    BankAccount richest = accounts[0];

    for (BankAccount account : accounts) {
      if (account.getBalance() > richest.getBalance()) {
        richest = account;
      }
    }

    return richest;
  }

  public static BankAccount findAccount(BankAccount[] accounts, String owner) {
    for (BankAccount account : accounts) {
      if (account.getOwner().compareTo(owner) == 0) {
        return account;
      }
    }

    return null;
  }

}
