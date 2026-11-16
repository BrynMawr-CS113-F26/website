
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuestList {
  public static void main(String[] args) {
    try {
      File file = new File("guests.txt");
      Scanner input = new Scanner(file);

      int count = 0;

      while (input.hasNextLine()) {
        String name = input.nextLine();
        System.out.println("Welcome, " + name + "!");
        count++;
      }

      input.close();

      System.out.println("Total guests: " + count);

    } catch (FileNotFoundException e) {
      System.out.println("Could not find guest list!");
    }
  }
}
