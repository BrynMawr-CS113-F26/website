class QuizTwo {
  public static void main(String[] args) {

  }

  public static int rowTotal(int[] row) {
    int sum = 0;

    for (int i = 0; i < row.length; i++) {
      sum += row[i];
    }

    return sum;
  }

  public static int highestScoringRow(int[][] scores) {
    int index = 0;
    int maxTotal = 0;

    for (int i = 0; i < scores.length; i++) {
      int rowTotal = 0;
      for (int j = 0; j < scores[i].length; j++) {
        rowTotal += scores[i][j];

      }
      if (rowTotal > maxTotal) {
        maxTotal = rowTotal;
        index = i;
      }
    }

    // for (int i = 0; i < scores.length; i++) {
    // int total = rowTotal(scores[i]);
    //
    // if (total > maxTotal) {
    // maxTotal = total;
    // index = i;
    // }
    // }

    return index;
  }
}
