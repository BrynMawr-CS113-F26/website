import java.util.Scanner;

public class Sqrt {
  public static int sqrtAndRound(int num) {
    double sqrt1 = Math.sqrt(num);
    int rounded1 = (int) Math.round(sqrt1);
    return rounded1;
  }

  public static void main(String[] args) {
    // System.out.println("Give me an number");
    // Scanner input = new Scanner(System.in);
    //
    // String numStr = input.nextLine();
    // double num = Double.parseDouble(numStr);
    //
    int num1 = 12;
    int num2 = 24;

    int rounded1 = sqrtAndRound(num1);
    int rounded2 = sqrtAndRound(num2);

    System.out.println("Rounded: " + rounded1);
    System.out.println("Rounded: " + rounded2);

  }

}
