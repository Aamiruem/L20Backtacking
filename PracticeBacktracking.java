// package L20BackTarcking;

public class PracticeBacktracking {

  // This method finds all possible paths from the top-left corner (0,0) to the
  // bottom-right corner (N-1, N-1) in an N x N matrix.
  // It uses backtracking to explore all possible paths and prints the path
  // sequence (psf) when the destination is reached.
  public static void findAllPaths(int i, // Current row index
      int j, // Current column index
      int N, // Size of the matrix (N x N)
      int[][] matrix, // The matrix representing the grid
      boolean[][] visited, // A 2D array to keep track of visited cells to avoid revisiting them
      String psf) { // Path so far (stores the sequence of moves taken to reach the current cell)

    // Base case: If the current cell is out of bounds, return (stop further
    // exploration)
    if (i < 0 || j < 0 || i >= N || j >= N) {
      return;
    }

    // Base case: If the current cell is blocked (0) or already visited, return
    // (stop further exploration)
    if (matrix[i][j] == 0 || visited[i][j] == true) {
      return;
    }

    // Base case: If the current cell is the destination (bottom-right corner),
    // print the path and return
    if (i == N - 1 && j == N - 1) {
      System.out.println("Reached destination with path " + psf);
      return;
    }

    // Mark the current cell as visited to avoid revisiting it in the current path
    visited[i][j] = true;

    // Recursively explore all four possible directions: Up, Down, Left, Right

    // Move Up: Decrement the row index (i-1) and append 'U' to the path
    findAllPaths(i - 1, j, N, matrix, visited, psf + "U");

    // Move Down: Increment the row index (i+1) and append 'D' to the path
    findAllPaths(i + 1, j, N, matrix, visited, psf + "D");

    // Move Left: Decrement the column index (j-1) and append 'L' to the path
    findAllPaths(i, j - 1, N, matrix, visited, psf + "L");

    // Move Right: Increment the column index (j+1) and append 'R' to the path
    findAllPaths(i, j + 1, N, matrix, visited, psf + "R");

    // Backtrack: Unmark the current cell as visited so it can be part of other
    // paths
    visited[i][j] = false;
  }

  // Main method to test the findAllPaths function
  public static void main(String[] args) {
    // Define a 4x4 matrix where 1 represents a valid path and 0 represents a
    // blocked cell
    int[][] matrix = { { 1, 1, 1, 1 }, { 0, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, };

    // Get the size of the matrix (N x N)
    int N = matrix.length;

    // Create a 2D boolean array to keep track of visited cells
    boolean[][] visited = new boolean[N][N];

    // Call the findAllPaths method starting from the top-left corner (0, 0) with an
    // empty path
    findAllPaths(0, 0, N, matrix, visited, "");

  }
}









