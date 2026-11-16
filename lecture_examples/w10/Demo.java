public class Demo {
  public static void main(String[] args) {
    // TicTacToeBoard game1 = new TicTacToeBoard();
    // TicTacToeBoard game2 = new TicTacToeBoard();
    //
    // game1.makeMove(1, 1, 'X');
    //
    // game1.printBoard();
    //
    // // game2.printBoard();
    //
    // TicTacToeBoard alias = game1;
    // alias = new TicTacToeBoard();
    //
    // alias.makeMove(0, 0, 'O');
    //
    // System.out.println();
    //
    // alias.printBoard();
    //
    // System.out.println();
    //
    // game1.printBoard();

    TicTacToeBoard b = new TicTacToeBoard();

    b.printBoard();

    b.makeMove(0, 2, 'X');
    b.makeMove(0, 2, 'O');
    b.makeMove(3, 0, 'X');

    b.printBoard();
  }
}
