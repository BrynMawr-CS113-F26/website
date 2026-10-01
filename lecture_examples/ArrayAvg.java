class ArrayAvg {
  public static void main(String[] args) {
    // Scanner in = new Scanner(System.in);
    int[] scores = new int[5];

    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }

    // int[] arr = { 10, 5, 9 };
    //
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    //
    // int i = 0;
    //
    // while (i < arr.length) {
    // System.out.println(arr[i]);
    // i++;
    // }
  }

  public static int average(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    int avg = sum / array.length;
    return avg;
  }

}
