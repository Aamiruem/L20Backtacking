public class SudokuProblem {

    // Method to check if placing a digit at a specific position is safe
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check the column for the same digit
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false; // If the digit is already present in the column, it's not safe
            }
        }

        // Check the row for the same digit
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false; // If the digit is already present in the row, it's not safe
            }
        }

        // Check the 3x3 subgrid for the same digit
        int gridStartRow = (row / 3) * 3; // Calculate the starting row of the 3x3 subgrid
        int gridStartCol = (col / 3) * 3; // Calculate the starting column of the 3x3 subgrid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[gridStartRow + i][gridStartCol + j] == digit) {
                    return false; // If the digit is already present in the subgrid, it's not safe
                }
            }
        }

        // If no conflicts are found, it is safe to place the digit at the given
        // position
        return true;
    }

    // Main Sudoku solver using backtracking
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base case: If all rows are filled (row == 9), the Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Calculate the next row and column indices
        int nextRow = col == 8 ? row + 1 : row; // Move to the next row if the current column is the last one
        int nextCol = (col + 1) % 9; // Move to the next column, wrapping around to 0 if necessary

        // If the current cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits from 1 to 9 in the current cell
        for (int digit = 1; digit <= 9; digit++) {
            // If placing the digit is safe, proceed
            if (isSafe(sudoku, row, col, digit)) {
                // Place the digit in the current cell
                sudoku[row][col] = digit;

                // Recursively try to solve the rest of the Sudoku
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // If a solution is found, return true
                }

                // If placing the digit doesn't lead to a solution, backtrack by resetting the
                // cell to 0
                sudoku[row][col] = 0;
            }
        }

        // If no valid digit can be placed in the current cell, backtrack to the
        // previous state
        return false;
    }

    // Utility method to print the Sudoku grid
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " "); // Print each cell value
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    public static void main(String[] args) {
        // Example Sudoku board with 0s as placeholders for empty cells
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 }, { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, { 8, 2, 7, 0, 0, 9, 0, 1, 3 }, };

        // Attempt to solve the Sudoku
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku); // Print the solved Sudoku
        } else {
            System.out.println("Solution does not exist"); // If no solution is found
        }
    }
}
