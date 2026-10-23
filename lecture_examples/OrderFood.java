class OrderFood {
  public static void main(String[] args) {
    int meal = 1; // 1 = breakfast, 2 = lunch
    int choice = 2;

    switch (meal) {

      case 1:
        switch (choice) {
          case 1:
            System.out.println("Pancakes");
            break;
          case 2:
            System.out.println("Waffles");
            break;
          default:
            System.out.println("Invalid breakfast");
        }
        break;
      case 2:
        switch (choice) {
          case 1:
            System.out.println("Sandwich");
            break;
          case 2:
            System.out.println("Salad");
            break;
          default:
            System.out.println("Invalid lunch");
        }
        break;
      default:
        System.out.println("Invalid meal");

    }
  }
}
