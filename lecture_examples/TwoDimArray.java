class TwoDemArray {
  public static void main(String[] args) {
    int[][] b = {
        { 10, 20, 30 },
        { 40, 50, 60 }
    };

    // Traverse
    for (int row = 0; row < b.length; row++) {
      for (int col = 0; col < b[row].length; col++) {
        System.out.println(b[row][col]);
      }
    }

    int sum = 0;
    // Sum every element
    for (int row = 0; row < b.length; row++) {
      for (int col = 0; col < b[row].length; col++) {
        sum += b[row][col];
      }
    }
    System.out.println(sum);

  }
}
