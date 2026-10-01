import java.util.Scanner;

class LabThree {
  public static void main(String[] args) {
    double firstNum = getUserInput();
    double secondNum = getUserInput();
    double thirdNum = getUserInput();

    double sum = sumThree(firstNum, secondNum, thirdNum);

    System.out.println("Sum is " + sum);

  }

  public static double sumThree(double first, double second, double third) {

    double sum = sumTwo(first, second) + third;
    // double sum = sumTwo(sumTwo(first, second), third);
    return sum;
  }

  public static double sumTwo(double first, double second) {
    double sum = first + second;
    return sum;
  }

  public static double getUserInput() {
    System.out.println("Please enter a number");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    double userNum = Double.parseDouble(userInput);
    return userNum;
  }
}
