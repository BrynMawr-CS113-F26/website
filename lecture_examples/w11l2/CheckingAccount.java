public class CheckingAccount extends BankAccount {
  private double monthlyFee;

  public CheckingAccount(String owner, double balance, double monthlyFee) {
    super(owner, balance);
    this.monthlyFee = monthlyFee;
  }

  // @Override
  // public void applyMonthlyUpdate() {
  // withdraw(monthlyFee);
  // }
}
