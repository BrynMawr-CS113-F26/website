import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatParty {
  public static void main(String[] args) {
    try {
      File file = new File("error.txt");
      Scanner input = new Scanner(file);

      while (input.hasNextLine()) {
        String name = input.nextLine();
        System.out.println("Welcome, " + name + " !");
      }

      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    }
  }
}
