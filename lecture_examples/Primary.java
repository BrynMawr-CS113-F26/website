import java.util.Scanner;

class Primary {
  public static void main(String[] args) {
    System.out.println("Please enter a color");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();

    String red = "red";
    String green = "green";
    String blue = "blue";

    if (userInput.compareTo(red) == 0 || userInput.compareTo(blue) == 0 || userInput.compareTo(green) == 0) {
      System.out.println("That's a primary color!");
    } else {
      System.out.println("Not a primary color");
    }
  }
}
