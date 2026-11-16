
public class BankAccount {

  private String owner;
  private double balance;

  // Constructor
  public BankAccount(String owner, double startingBalance) {
    this.owner = owner;

    if (startingBalance < 0) {
      this.balance = 0.0;
    } else {
      this.balance = startingBalance;
    }
  }

  // Getter for owner
  public String getOwner() {
    return owner;
  }

  // Getter for balance
  public double getBalance() {
    return balance;
  }

  // Deposit money
  public boolean deposit(double amount) {
    if (amount <= 0) {
      return false;
    }

    balance += amount;
    return true;
  }

  // Withdraw money
  public boolean withdraw(double amount) {
    if (amount <= 0 || amount > balance) {
      return false;
    }

    balance -= amount;
    return true;
  }
}
