public class TicTacToeBoard {
  // Private field / data
  private char[][] board;

  public TicTacToeBoard() {
    this.board = new char[3][3];

    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        this.board[row][col] = '-';
      }
    }
  }

  public void printBoard() {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }

  }

  public boolean makeMove(int row, int col, char player) {
    // Outside the board
    //
    // Already occupied
    //
    // Check player is X or O
    //

    if ((row < 0 || row > 2) || (col < 0 || col > 2)) {
      return false;
    }

    if (board[row][col] != '-') {
      return false;
    }

    if (player != 'X' && player != 'O') {
      return false;
    }

    board[row][col] = player;
    return true;
  }
}
