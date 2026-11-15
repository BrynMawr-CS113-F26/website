public class SavingsAccount extends BankAccount {
  private double interestRate;

  public SavingsAccount(String owner, double balance, double interestRate) {
    super(owner, balance); // invokes the BankAccount constructor
    this.interestRate = interestRate;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void addInterest() {

    double interest = getBalance() * interestRate;
    deposit(interest);
  }

  @Override
  public String describe() {
    return "Savings: " + getBalance() + " has $" + getBalance();
  }

}
