public class PracticeBacktrackings {

    // This method attempts to find all possible paths a knight can take on an N x N
    // chessboard
    // such that it visits every cell exactly once (a Knight's Tour).
    // It uses backtracking to explore all possible moves of the knight.
    public static void KnightPaths(int i, // Current row index of the knight's position
            int j, // Current column index of the knight's position
            int N, // Size of the chessboard (N x N)
            int[][] matrix, // The chessboard represented as a 2D array, where each cell stores the move
                            // number
            int moveNumber) // The current move number (starting from 0)
    {
        // Base case: If the knight moves outside the chessboard boundaries, return
        // (stop further exploration)
        if (i < 0 || j < 0 || i >= N || j >= N) {
            return;
        }

        // Base case: If the current cell has already been visited (i.e., it's not 0),
        // return (stop further exploration)
        if (matrix[i][j] != 0) {
            return;
        }

        // Mark the current cell with the current move number
        matrix[i][j] = moveNumber;

        // Base case: If the knight has visited all cells (i.e., moveNumber == N * N -
        // 1), print the chessboard
        if (moveNumber == N * N - 1) {
            // Print the chessboard configuration
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    System.out.print(matrix[x][y] + " "); // Print the move number at each cell
                }
                System.out.println(); // Move to the next row
            }
            return; // Stop further exploration
        }

        // Recursively explore all 8 possible moves of the knight in the following
        // order:
        // 1. Move 2 steps up and 1 step right
        KnightPaths(i - 2, j + 1, N, matrix, moveNumber + 1);
        // 2. Move 1 step up and 2 steps right
        KnightPaths(i - 1, j + 2, N, matrix, moveNumber + 1);
        // 3. Move 1 step down and 2 steps right
        KnightPaths(i + 1, j + 2, N, matrix, moveNumber + 1);
        // 4. Move 2 steps down and 1 step right
        KnightPaths(i + 2, j + 1, N, matrix, moveNumber + 1);
        // 5. Move 2 steps down and 1 step left
        KnightPaths(i + 2, j - 1, N, matrix, moveNumber + 1);
        // 6. Move 1 step down and 2 steps left
        KnightPaths(i + 1, j - 2, N, matrix, moveNumber + 1);
        // 7. Move 1 step up and 2 steps left
        KnightPaths(i - 1, j - 2, N, matrix, moveNumber + 1);
        // 8. Move 2 steps up and 1 step left
        KnightPaths(i - 2, j - 1, N, matrix, moveNumber + 1);

        // Backtrack: Unmark the current cell (set it back to 0) so it can be part of
        // other paths
        matrix[i][j] = 0;
    }

    // Main method to test the KnightPaths function
    public static void main(String[] args) {
        // Start the Knight's Tour from the top-left corner (0, 0) on an 8x8 chessboard
        KnightPaths(0, 0, 8, new int[8][8], 0);
    }
}
