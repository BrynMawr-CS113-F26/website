import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    numbers.remove(0);
    numbers.set(1, 42);
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    // Initialize an empty ArrayList
    ArrayList<String> list = new ArrayList<>();
    list.add("apple");

    // Initialize ArrayList with some values
    //
    // create a ArrayList String type
    // and Initialize an ArrayList with List.of()
    List<String> al = new ArrayList<>(
        List.of("Geeks",
            "for",
            "Geeks"));

    // print ArrayList
    System.out.println("ArrayList : " + al);

    // Initialize empty array
    String[] array = new String[1];
    array[0] = "apple";

  }
}
