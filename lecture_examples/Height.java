import java.util.Scanner;

class Height {
  public static void main(String[] args) {
    System.out.println("Please enter your height in inches");

    Scanner input = new Scanner(System.in);
    String heightStr = input.nextLine();

    try {
      int height = Integer.parseInt(heightStr);

      if (height >= 60) {
        System.out.println("You are tall enough. You can ride 5ft rides.");
      } else if (height >= 48) {
        System.out.println("You are tall enough. You can ride 4ft rides.");
      } else if (height >= 36) {
        System.out.println("You are tall enough. You can ride 3ft rides.");
      } else {
        System.out.println("sorry you can't ride:(");
      }

    } catch (NumberFormatException e) {
      System.out.println("Please enter a valid integer.");
    }

    // int threeFeet = 36;
    // int fourFeet = 48;
    // int fiveFeet = 60;

  }
}
