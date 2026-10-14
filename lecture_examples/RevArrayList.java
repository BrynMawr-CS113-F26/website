import java.util.ArrayList;
import java.util.Scanner;

public class RevArrayList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter integers one at a time.");
    System.out.println("Type \"done\" when you are finished.");

    String userInput = "";

    while (!userInput.equals("done")) {
      System.out.print("Enter an integer or \"done\": ");
      userInput = input.nextLine();

      if (!userInput.equals("done")) {
        int number = Integer.parseInt(userInput);
        numbers.add(number);
      }
    }

    System.out.println("Numbers in reverse order:");

    for (int i = numbers.size() - 1; i >= 0; i--) {
      System.out.println(numbers.get(i));
    }

    input.close();
  }
}
