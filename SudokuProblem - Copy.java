package L20BackTarcking;
// public class SudokuProblem {

//   public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//     //column
//     for (int i = 0; i <= 8; i++) {
//       if (sudoku[i][col] == digit) {
//         return false;
//       }
//     }
//     // row
//     for (int j = 0; j <= 8; j++) {
//       if (sudoku[row][j] == digit) {
//         return false;
//       }
//     }
//     //grid
//     int sr = (row / 3) * 3;
//     int sc = (col / 3) * 3;
//     // 3*3
//     for (int i = sr; i < sr + 3; i++) {
//       for (int j = sc; j < sc + 3; j++) {
//         if (sudoku[i][j] == digit) {
//           return false;
//         }
//       }
//     }
//     return true;
//   }

//   public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//     // base case
//     if (row == 9) {
//       return true;
//     }
//     // recursion
//     int nextRow = row, nextCol = col + 1;
//     if (col + 1 == 9) {
//       nextRow = row + 1;
//       nextCol = 0;
//     }
//     if (sudoku[row][col] != 0) {
//       return sudokuSolver(sudoku, nextRow, nextCol);
//     }
//     for (int digit = 1; digit <= 9; digit++) {
//       if (isSafe(sudoku, row, col, digit)) {
//         sudoku[row][col] = digit;
//         if (sudokuSolver(sudoku, nextRow, nextCol)) { //solution exists
//           return true;
//         }
//         sudoku[row][col] = 0;
//       }
//     }
//     return false;
//   }

//   public static void printSudoku(int sudoku[][]) {
//     for (int i = 0; i < 9; i++) {
//       for (int j = 0; j < 9; j++) {
//         System.out.print(sudoku[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int sudoku[][] = {
//       { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
//       { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
//       { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
//       { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
//       { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
//       { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
//       { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
//       { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
//       { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
//     };

//     if (sudokuSolver(sudoku, 0, 0)) {
//       System.out.println("solution exists");
//       printSudoku(sudoku);
//     } else {
//       System.out.println("Solution does not exist");
//     }
//   }
// }

// public class SudokuProblem {

//   public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//     for (int i = 0; i < 9; i++) {
//       if (sudoku[i][col] == digit || sudoku[row][i] == digit) {
//         return false;
//       }
//     }

//     int gridStartRow = (row / 3) * 3;
//     int gridStartCol = (col / 3) * 3;

//     for (int i = 0; i < 3; i++) {
//       for (int j = 0; j < 3; j++) {
//         if (sudoku[gridStartRow + i][gridStartCol + j] == digit) {
//           return false;
//         }
//       }
//     }

//     return true;
//   }

//   public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//     if (row == 9) {
//       return true;
//     }

//     int nextRow = col == 8 ? row + 1 : row;
//     int nextCol = (col + 1) % 9;

//     if (sudoku[row][col] != 0) {
//       return sudokuSolver(sudoku, nextRow, nextCol);
//     }

//     for (int digit = 1; digit <= 9; digit++) {
//       if (isSafe(sudoku, row, col, digit)) {
//         sudoku[row][col] = digit;
//         if (sudokuSolver(sudoku, nextRow, nextCol)) {
//           return true;
//         }
//         sudoku[row][col] = 0;
//       }
//     }
//     return false;
//   }

//   public static void printSudoku(int sudoku[][]) {
//     for (int i = 0; i < 9; i++) {
//       for (int j = 0; j < 9; j++) {
//         System.out.print(sudoku[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int sudoku[][] = {
//       { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
//       { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
//       { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
//       { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
//       { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
//       { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
//       { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
//       { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
//       { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
//     };

//     if (sudokuSolver(sudoku, 0, 0)) {
//       System.out.println("Solution exists");
//       printSudoku(sudoku);
//     } else {
//       System.out.println("Solution does not exist");
//     }
//   }
// }

public class SudokuProblem {

  // Check if placing a digit at a specific position is safe
  public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
    // Check the column
    for (int i = 0; i < 9; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }

    // Check the row
    for (int i = 0; i < 9; i++) {
      if (sudoku[row][i] == digit) {
        return false;
      }
    }

    // Check the 3x3 grid
    int gridStartRow = (row / 3) * 3;
    int gridStartCol = (col / 3) * 3;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (sudoku[gridStartRow + i][gridStartCol + j] == digit) {
          return false;
        }
      }
    }

    // If no conflicts, it is safe to place the digit at the given position
    return true;
  }

  // Main Sudoku solver using backtracking
  public static boolean sudokuSolver(int sudoku[][], int row, int col) {
    // Base case: If all rows are filled, the Sudoku is solved
    if (row == 9) {
      return true;
    }

    // Calculate the next row and column indices
    int nextRow = col == 8 ? row + 1 : row;
    int nextCol = (col + 1) % 9;

    // If the cell is already filled, move to the next cell
    if (sudoku[row][col] != 0) {
      return sudokuSolver(sudoku, nextRow, nextCol);
    }

    // Try placing digits from 1 to 9
    for (int digit = 1; digit <= 9; digit++) {
      // If placing the digit is safe, proceed
      if (isSafe(sudoku, row, col, digit)) {
        // Place the digit
        sudoku[row][col] = digit;

        // Recursively try to solve the rest of the Sudoku
        if (sudokuSolver(sudoku, nextRow, nextCol)) {
          return true; // Solution found
        }

        // If placing the digit doesn't lead to a solution, backtrack
        sudoku[row][col] = 0;
      }
    }

    // No valid digit found, backtrack to the previous state
    return false;
  }

  // Utility method to print the Sudoku grid
  public static void printSudoku(int sudoku[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // Example Sudoku board with 0s as placeholders for empty cells
    int sudoku[][] = {
      { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
      { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
      { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
      { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
      { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
      { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
      { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
      { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
      { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
    };

    // Attempt to solve the Sudoku
    if (sudokuSolver(sudoku, 0, 0)) {
      System.out.println("Solution exists");
      printSudoku(sudoku);
    } else {
      System.out.println("Solution does not exist");
    }
  }
}
