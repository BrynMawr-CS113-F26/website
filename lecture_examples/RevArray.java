import java.util.Scanner;

public class RevArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numbers = new int[5];

    // Ask the user for 5 integers
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter integer " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    // Print the integers in reverse order
    System.out.println("Numbers in reverse order:");

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.println(numbers[i]);
    }

    input.close();
  }
}
