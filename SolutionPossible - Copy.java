package L20BackTarcking;
// public class SolutionPossible {

//   public static boolean isSafe(char board[][], int row, int col) {
//     // vertical up
//     for (int i = row - 1; i >= 0; i--) {
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }
//     // diagonal left up
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     // diagonal right up
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;
//   }

//   public static boolean nQueens(char board[][], int row, int count) {
//     // base
//     if (row == board.length) {
//       count++;
//       printBoard(board);
//       return true;
//     }

//     // column loop
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';
//         if (nQueens(board, row + 1, count)) { // function call
//           // Uncomment the following line if you want to find all solutions
//           // board[row][j] = 'x'; // backtracking step
//         }
//         board[row][j] = 'x'; // backtracking step
//       }
//     }
//     return false;
//   }

//   public static void printBoard(char board[][]) {
//     System.out.println("----- chess board ------");
//     for (int i = 0; i < board.length; i++) {
//       for (int j = 0; j < board.length; j++) {
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//     System.out.println("------------------------");
//   }

//   public static void main(String[] args) {
//     int n = 4;
//     char board[][] = new char[n][n];
//     // initialize
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'x';
//       }
//     }

//     int count = 0;
//     if (nQueens(board, 0, count)) {
//       System.out.println("Total solutions: " + count);
//     } else {
//       System.out.println("No solution found.");
//     }
//   }
// }

// public class SolutionPossible {

//   public static int count = 0;

//   public static boolean isSafe(char board[][], int row, int col) {
//     // Check if there is a queen in the same column
//     for (int i = row - 1; i >= 0; i--) {
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }
//     // Check upper left diagonal
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     // Check upper right diagonal
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;
//   }

//   public static boolean nQueens(char board[][], int row) {
//     // Base case: if all queens are placed
//     if (row == board.length) {
//       count++;
//       return true;
//     }
//     // Recursive case: try placing queen in each column of the current row
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';
//         if (nQueens(board, row + 1)) {
//           // If placing queen leads to a solution, return true
//           return true;
//         }
//         board[row][j] = 'x'; // Backtrack if placing queen doesn't lead to a solution
//       }
//     }
//     // If no column is suitable for placing the queen in the current row
//     return false;
//   }

//   public static void printBoard(char board[][]) {
//     System.out.println("----- Chess Board ------");
//     for (int i = 0; i < board.length; i++) {
//       for (int j = 0; j < board.length; j++) {
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 4;
//     char board[][] = new char[n][n];
//     // Initialize the board with 'x'
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'x';
//       }
//     }
//     if (nQueens(board, 0)) {
//       System.out.println("Solution is possible");
//       printBoard(board);
//     } else {
//       System.out.println("Solution is not possible");
//     }
//   }
// }

public class SolutionPossible {

  public static int count = 0;

  public static boolean isSafe(char board[][], int row, int col) {
    //vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static boolean nQueens(char board[][], int row) {
    //base
    if (row == board.length) {
      //   printBoard(board);
      count++;
      return true;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueens(board, row + 1)) { //function call
          return true;
        }
        board[row][j] = 'x'; //backtracking step
      }
    }
    return false;
  }

  public static void printBoard(char board[][]) {
    System.out.println("----- chess board ------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 5;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'x';
      }
    }
    // int count = 0;
    if (nQueens(board, 0)) {
      System.out.println("solution is possible");
      printBoard(board);
    } else {
      System.out.println("solution is not possible");
    }
  }
}
