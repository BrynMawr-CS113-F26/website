public class WeekNine {
  public static void main(String[] args) {
    // Create two Cat objects
    Cat milo = new Cat("Milo", 12);
    Cat poppy = new Cat("poppy", 4);

    Cat newCat = poppy;
    newCat.setName("bob");

    System.out.println(poppy.getName());

    // poppy.name = "milo";
    // poppy.age = -47;

    // poppy.setAge(-47);
    // poppy.name = null;

    System.out.println(poppy.getAge());
  }
}
