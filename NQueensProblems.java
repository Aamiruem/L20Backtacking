// public class NQueensProblem {

//   public static boolean isSafe(char board[][], int row, int col) {
//     // Vertical up
//     for (int i = row - 1; i >= 0; i--) {
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }
//     // Diagonal left up
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     // Diagonal right up
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;
//   }

//   public static void nQueens(char board[][], int row) {
//     // Base case: all queens are placed
//     if (row == board.length) {
//       printBoard(board);
//       return;
//     }
//     // Try placing queen in each column of the current row
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';
//         nQueens(board, row + 1); // Recur for the next row
//         board[row][j] = 'x'; // Backtrack: undo the placement
//       }
//     }
//   }

//   public static void printBoard(char[][] board) {
//     System.out.println("----- Chess Board ------");
//     for (int i = 0; i < board.length; i++) {
//       for (int j = 0; j < board.length; j++) {
//         if ((i + j) % 2 == 0) {
//           System.out.print("\u001B[47m"); // White background
//         } else {
//           System.out.print("\u001B[40m"); // Black background
//         }

//         if (board[i][j] == 'Q') {
//           System.out.print("\u001B[31m"); // Red text for Queen
//         }

//         System.out.print(board[i][j] + " ");
//         System.out.print("\u001B[0m"); // Reset color
//       }
//       System.out.println();
//     }
//     System.out.println();
//   }

//   public static void main(String[] args) {
//     int n = 4; // Change this to the desired size of the chessboard
//     char board[][] = new char[n][n];
//     // Initialize the chessboard
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'x';
//       }
//     }
//     nQueens(board, 0); // Start placing queens from the first row
//   }
// }

// public class NQueensProblems {

//   public static void solveNQueens(int n) {
//     int[] queens = new int[n];
//     placeQueens(queens, 0, n);
//   }

//   private static void placeQueens(int[] queens, int row, int n) {
//     if (row == n) {
//       // Valid placement found, print or process the solution
//       // (this depends on the specific problem)
//       printSolution(queens);
//       return;
//     }

//     for (int col = 0; col < n; col++) {
//       if (isValidPlacement(queens, row, col)) {
//         queens[row] = col;
//         placeQueens(queens, row + 1, n);
//       }
//     }
//   }

//   private static boolean isValidPlacement(int[] queens, int row, int col) {
//     for (int i = 0; i < row; i++) {
//       if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
//         return false;
//       }
//     }
//     return true;
//   }

//   private static void printSolution(int[] queens) {
//     // Print or process the solution as needed
//     // (In this example, we're printing the board configuration)
//     for (int i = 0; i < queens.length; i++) {
//       for (int j = 0; j < queens.length; j++) {
//         System.out.print(queens[i] == j ? "Q " : ". ");
//       }
//       System.out.println();
//     }
//     System.out.println();
//   }

//   public static void main(String[] args) {
//     solveNQueens(8); // Solve the 8-Queens problem
//   }
// }












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
  }
}
