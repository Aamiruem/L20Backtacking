package L20BackTarcking;
public class KnightsTour {

  // Board size
  static int N = 8;

  // Check if the knight can move to the given position
  public static boolean isSafe(int x, int y, int sol[][]) {
    return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
  }

  // Print the solution matrix
  public static void printSolution(int sol[][]) {
    for (int x = 0; x < N; x++) {
      for (int y = 0; y < N; y++) System.out.print(sol[x][y] + " ");
      System.out.println();
    }
  }

  // Main function to solve the Knight's Tour problem
  public static boolean solveKT() {
    int sol[][] = new int[8][8];

    // Initialize the solution matrix with -1
    for (int x = 0; x < N; x++) for (int y = 0; y < N; y++) sol[x][y] = -1;

    // Possible moves for the Knight
    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    // Start from cell (0,0)
    sol[0][0] = 0;

    // If the Knight's Tour is not possible, print a message and return false
    if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
      System.out.println("Solution does not exist");
      return false;
    } else {
      // Print the solution if it exists
      printSolution(sol);
      return true;
    }
  }

  // Utility function to solve the Knight's Tour using backtracking
  public static boolean solveKTUtil(
    int x,
    int y,
    int movie,
    int sol[][],
    int xMove[],
    int yMove[]
  ) {
    int k, next_x, next_y;

    // If all moves are completed, the solution is found
    if (movie == N * N) return true;

    // Try all next moves from the current coordinate
    for (k = 0; k < 8; k++) {
      next_x = x + xMove[k];
      next_y = y + yMove[k];

      // Check if the next move is safe
      if (isSafe(next_x, next_y, sol)) {
        sol[next_x][next_y] = movie;

        // Recur to explore further moves
        if (
          solveKTUtil(next_x, next_y, movie + 1, sol, xMove, yMove)
        ) return true; else sol[next_x][next_y] = -1; // Backtrack if the current move doesn't lead to a solution
      }
    }
    return false; // If no move leads to a solution, return false
  }

  public static void main(String args[]) {
    solveKT(); // Call the main function to solve the Knight's Tour problem
  }
}
