import java.util.concurrent.ThreadLocalRandom;

class Blackjack {
  public static void main(String[] args) {
    int min = 2;
    int max = 21;

    int randomInt = ThreadLocalRandom.current().nextInt(min, max + 1);
    System.out.println("Random int: " + randomInt);

    if (randomInt == 21) {
      System.out.println("Blackjack!");
    } else if ((randomInt >= 17) && (randomInt <= 20)) {
      System.out.println("Stand");
    } else {
      System.out.println("Hit me!");
    }
  }
}
