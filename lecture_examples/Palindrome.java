class Palindrome {
  public static void main(String[] args) {
    String str1 = "racecar";
    String str2 = "kelly";

    if (isPalindrome(str1)) {
      System.out.println("yep");
    }
    if (isPalindromeLoop(str1)) {
      System.out.println("yep");
    }
  }

  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) {
      return true;
    }

    if (s.charAt(0) != s.charAt(s.length() - 1)) {
      return false;
    }

    return isPalindrome(s.substring(1, s.length() - 1));
  }

  public static boolean isPalindromeLoop(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }
}
