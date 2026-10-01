import java.util.Scanner;

class WeekFour {
  public static void main(String[] args) {

    // countdown(3);
    // countdownIt(3);
    // int s = sumIt(3);
    userNumQuery();

  }

  public static void countdownRec(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
      return;
    }

    System.out.println(n);
    countdownRec(n - 1);
  }

  public static void countdownIt(int n) {
    while (n > 0) {
      System.out.println(n);
      n--;
    }
    System.out.println("Blastoff!");
  }

  public static int sumRec(int n) {
    if (n == 1) {
      return 1;
    }
    return n + sumRec(n - 1);
  }

  public static int sumIt(int n) {
    int sum = 0;

    while (n > 0) {
      // sum = sum + n;
      sum += n;
      System.out.println("Uh oh");
      // n--;
    }
    return sum;
  }

  public static int factorialRec(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorialRec(n - 1);
  }

  public static int factorialIt(int n) {
    int fact = 1;
    while (n > 0) {
      fact = fact * n;
      n--;
    }

    return fact;
  }

  public static void userNumQuery() {
    Scanner in = new Scanner(System.in);
    boolean positiveNum = false;

    while (!positiveNum) {
      System.out.println("Please give me a positive number.");
      String userInput = in.nextLine();
      int userInt = Integer.parseInt(userInput);

      if (userInt > 0) {
        positiveNum = true;
      }

    }

  }

}
