
public class Cat {
  // Instance variables
  private String name;
  private int age;

  // Constructor
  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  //
  public void setAge(int a) {
    if (a >= 0 && a <= 25) {
      age = a;
    }
  }

  public void celebrateBirthday() {
    // age++;
    int newAge = age + 1;
    age = newAge;
  }

  public void printAge() {
    System.out.println(newAge);
  }

  public int getAge() {
    return age;
  }

  // Getters
  // public String getName() {
  // return name;
  // }
  //
  // public int getAge() {
  // return age;
  // }
  //
  // public String getColor() {
  // return color;
  // }
  //
  // // Setter
  // public void setAge(int age) {
  // if (age >= 0) {
  // this.age = age;
  // }
  // }
  //
  // // Instance method
  // public void meow() {
  // System.out.println(name + " says meow!");
  // }
  //
  // public void introduce() {
  // System.out.println("Hi! I'm " + name
  // + ", a " + age + "-year-old " + color + " cat.");
  // }
}
