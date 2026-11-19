public class Main {
  public static void main(String[] args) {
    Flyable f1 = new Bird("Polly");
    Flyable f2 = new Airplane();

    f1.fly();
    f2.fly();

    Flyable[] things = {
        new Bird("Pam"),
        new Airplane(),
        new Bird("Barb"),
    };

    for (int i = 0; i < things.length; i++) {
      things[i].fly();
    }

  }

  public static void takeOff(Flyable thing) {
    thing.fly();
  }

}
