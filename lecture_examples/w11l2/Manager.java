public class Manager extends Employee {
  private String department;

  Manager(String name, String department) {
    super(name);
    this.department = department;
  }

  @Override
  public void describe() {
    System.out.println("Employee: " + getName() + " Department: " + department);
  }
}
