class Duck extends Animal implements Flyable, Swimmable {
  public Duck(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Quack!");
  }

  @Override
  public void fly() {
    System.out.println("Flying over a pond");
  }

  @Override
  public void swim() {
    System.out.println("Swimming in the pond");
  }
}
