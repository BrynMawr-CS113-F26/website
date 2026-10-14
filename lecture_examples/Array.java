class Array {
  public static void main(String[] args) {
    // int[] nums = { 1, 2, 3, 4 };
    //
    // for (int i = 0; i < nums.length; i++) {
    // nums[i] = nums[i] * 2;
    // }
    // for (int i = 0; i < nums.length; i++) {
    // System.out.println(nums[i]);
    // }

    // int x = 5;
    // int y = x;
    // x = 12;
    //
    // System.out.println("x is: " + x);
    // System.out.println("y is: " + y);

    int[] a = { 1, 2, 3 };
    changeFirst(a);
    System.out.println(a[0]);
    // int[] b = a;
    // b[0] = 99;

    // System.out.println(a[0]);
    //

    int n = 5;
    change(n);
    System.out.println(n);

    String s = "hello";
    String t = s;
    // t = t.toUpperCase();
    t.toUpperCase();
    System.out.println(s);
    System.out.println(t);
  }

  public static void change(int x) {
    x = 100;
  }

  public static void changeFirst(int[] nums) {
    nums[0] = 100;
  }

  public static int[] newArray(int[] arr) {
    int l = arr.length;

    int[] b = new int[5];

    for (int i = 0; i < l; i++) {
      b[i] = arr[i];
    }

    return b;
  }
}
