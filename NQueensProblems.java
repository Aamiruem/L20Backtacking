public class NQueensProblems {

  // Method to check if it's safe to place a queen at board[row][col]
  public static boolean isSafe(char board[][], int row, int col) {
    // Check vertically above the current position
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false; // If a queen is found, it's not safe
      }
    }
    // Check diagonally left above the current position
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false; // If a queen is found, it's not safe
      }
    }
    // Check diagonally right above the current position
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false; // If a queen is found, it's not safe
      }
    }
    return true; // If no conflicts, it's safe to place the queen
  }

  // Recursive method to solve the N-Queens problem
  public static void nQueens(char board[][], int row) {
    // Base case: if all queens are placed (reached the last row)
    if (row == board.length) {
      printBoard(board); // Print the current board configuration
      count++; // Increment the count of solutions
      return;
    }
    // Try placing a queen in each column of the current row
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) { // Check if it's safe to place the queen
        board[row][j] = 'Q'; // Place the queen
        nQueens(board, row + 1); // Recur for the next row
        board[row][j] = 'x'; // Backtrack: remove the queen and try the next column
      }
    }
  }

  // Method to print the chessboard
  public static void printBoard(char board[][]) {
    System.out.println("----- chess board ------");
    for (char[] board1 : board) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board1[j] + " "); // Print each cell of the board
      }
      System.out.println(); // Move to the next line after each row
    }
  }

  static int count = 0; // To count the number of ways to solve the problem

  // Main method to test the N-Queens problem
  public static void main(String[] args) {
    int n = 4; // Size of the chessboard (n x n)
    char board[][] = new char[n][n]; // Create the chessboard
    // Initialize the chessboard with 'x' (empty cells)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'x';
      }
    }
    nQueens(board, 0); // Start solving the problem from the first row (row 0)
    System.out.println("Total ways to solve N-Queens = " + count);
  }
}
