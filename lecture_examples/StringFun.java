class StringFun {
  public static void main(String[] args) {
    String str1 = "Kelly";
    String str2 = "kelly";

    if (str1.compareTo(str2) != 0) {
      System.out.println("Strings are not equal");
    }

    if (str1.contains("el")) {
      System.out.println("Found it");
    }

    System.out.println("Length of str1 is " + str1.length());

    System.out.println("Char at location 2 in str1 is: " + str1.charAt(2));

    String text = "Java is fun to learn";

    // Split by a single space character
    String[] words = text.split(" ");

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
  }
}
