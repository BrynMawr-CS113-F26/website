
class RecExs {
  public static void main(String[] args) {
    // printStars(4);
    int num = fact(4);
  }

  public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blast off!");
      return;
    }

    System.out.println("Before: " + n);
    countdown(n - 1);
    System.out.println("After: " + n);
  }

  public static int sum(int n) {
    if (n == 1) {
      return 1;
    }

    return n + sum(n - 1);
  }

  public static void printStars(int n) {
    if (n == 0) {
      return;
    }

    System.out.print("*");
    printStars(n - 1);
  }

  public static int fact(int n) {
    if (n == 1) {
      return 1;
    }

    return n * fact(n);
  }

}
