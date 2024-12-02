package L20BackTarcking;
// public class KnightBoard {

//   static int N = 8;

//   // Check if the move (x, y) is inside the board and the cell is not visited
//   public static boolean isSafe(int x, int y, int sol[][]) {
//     return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//   }

//   // Print the solution matrix
//   public static void printSolution(int sol[][]) {
//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         System.out.print(sol[x][y] + " ");
//       }
//       System.out.println();
//     }
//   }

//   // Solve the Knight's Tour problem
//   public static boolean solveKT() {
//     int sol[][] = new int[N][N];

//     // Initialize the solution matrix with -1
//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         sol[x][y] = -1;
//       }
//     }

//     // Possible moves for the knight
//     int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//     int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//     // The knight starts from cell (0,0)
//     sol[0][0] = 0;

//     // If the knight's tour can be completed, print the solution
//     if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//       System.out.println("Solution does not exist");
//       return false;
//     } else {
//       printSolution(sol);
//       return true;
//     }
//   }

//   // Utility function to solve the Knight's Tour problem using backtracking
//   public static boolean solveKTUtil(
//     int x,
//     int y,
//     int movei,
//     int sol[][],
//     int xMove[],
//     int yMove[]
//   ) {
//     int k, next_x, next_y;

//     // If all moves are completed, the solution is found
//     if (movei == N * N) {
//       return true;
//     }

//     // Try all next moves from the current coordinate
//     for (k = 0; k < 8; k++) {
//       next_x = x + xMove[k];
//       next_y = y + yMove[k];

//       // Check if the next move is valid
//       if (isSafe(next_x, next_y, sol)) {
//         sol[next_x][next_y] = movei;

//         // Recur to explore the next move
//         if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
//           return true;
//         } else {
//           // If the recursion does not lead to a solution, backtrack
//           sol[next_x][next_y] = -1;
//         }
//       }
//     }

//     // If no move is possible, return false
//     return false;
//   }

//   public static void main(String[] args) {
//     solveKT();
//   }
// }

// public class KnightBoard {

//   static int N = 8;

//   public static boolean isSafe(int x, int y, int sol[][]) {
//     return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//   }

//   public static void printSolution(int sol[][]) {
//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         System.out.print(sol[x][y] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static boolean solveKT() {
//     int sol[][] = new int[8][8];

//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         sol[x][y] = -1;
//       }
//     }

//     int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//     int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//     // The knight starts from cell (0,0)
//     sol[0][0] = 0;

//     if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//       System.out.println("Solution does not exist");
//       return false;
//     } else {
//       printSolution(sol);
//       return true;
//     }
//   }

//   public static boolean solveKTUtil(
//     int x,
//     int y,
//     int movei,
//     int sol[][],
//     int xMove[],
//     int yMove[]
//   ) {
//     int k, next_x, next_y;

//     // If all moves are completed, the solution is found
//     if (movei == N * N) {
//       return true;
//     }

//     for (k = 0; k < 8; k++) {
//       next_x = x + xMove[k];
//       next_y = y + yMove[k];

//       if (isSafe(next_x, next_y, sol)) {
//         sol[next_x][next_y] = movei;

//         if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
//           return true;
//         } else {
//           sol[next_x][next_y] = -1; // Backtracking
//         }
//       }
//     }

//     return false;
//   }

//   public static void main(String[] args) {
//     solveKT();
//   }
// }

// public class KnightBoard {

//   static int N = 8;

//   public static boolean isSafe(int x, int y, int sol[][]) {
//     return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//   }

//   public static void printSolution(int sol[][]) {
//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         System.out.print(sol[x][y] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static boolean solveKT() {
//     int sol[][] = new int[8][8];

//     for (int x = 0; x < N; x++) {
//       for (int y = 0; y < N; y++) {
//         sol[x][y] = -1;
//       }
//     }

//     int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//     int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//     // The knight starts from cell (0,0)
//     sol[0][0] = 0;

//     if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//       System.out.println("Solution does not exist");
//       return false;
//     } else {
//       printSolution(sol);
//       return true;
//     }
//   }

//   public static boolean solveKTUtil(
//     int x,
//     int y,
//     int movei,
//     int sol[][],
//     int xMove[],
//     int yMove[]
//   ) {
//     int k, next_x, next_y;

//     // If all moves are completed, the solution is found
//     if (movei == N * N) {
//       return true;
//     }

//     for (k = 0; k < 8; k++) {
//       next_x = x + xMove[k];
//       next_y = y + yMove[k];

//       if (isSafe(next_x, next_y, sol)) {
//         sol[next_x][next_y] = movei;

//         if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
//           return true;
//         } else {
//           sol[next_x][next_y] = -1; // Backtracking
//         }
//       }
//     }

//     return false;
//   }

//   public static void main(String[] args) {
//     solveKT();
//   }
// }

public class KnightBoard {

  static int N = 8;

  // Check if the move (x, y) is inside the board and the cell is not visited
  public static boolean isSafe(int x, int y, int sol[][]) {
    return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
  }

  // Print the solution matrix
  public static void printSolution(int sol[][]) {
    for (int x = 0; x < N; x++) {
      for (int y = 0; y < N; y++) {
        System.out.print(sol[x][y] + " ");
      }
      System.out.println();
    }
  }

  // Solve the Knight's Tour problem
  public static boolean solveKT() {
    int sol[][] = new int[N][N];

    // Initialize the solution matrix with -1
    for (int x = 0; x < N; x++) {
      for (int y = 0; y < N; y++) {
        sol[x][y] = -1;
      }
    }

    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    // The knight starts from cell (0,0)
    sol[0][0] = 0;

    // If the knight's tour can be completed, print the solution
    if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
      System.out.println("Solution does not exist");
      return false;
    } else {
      printSolution(sol);
      return true;
    }
  }

  // Utility function to solve the Knight's Tour problem using backtracking
  public static boolean solveKTUtil(
    int x,
    int y,
    int movei,
    int sol[][],
    int xMove[],
    int yMove[]
  ) {
    int k, next_x, next_y;

    // If all moves are completed, the solution is found
    if (movei == N * N) {
      return true;
    }

    // Try all next moves from the current coordinate
    for (k = 0; k < 8; k++) {
      next_x = x + xMove[k];
      next_y = y + yMove[k];

      // Check if the next move is valid
      if (isSafe(next_x, next_y, sol)) {
        sol[next_x][next_y] = movei;

        // Recur to explore the next move
        if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
          return true;
        } else {
          // If the recursion does not lead to a solution, backtrack
          sol[next_x][next_y] = -1;
        }
      }
    }

    // If no move is possible, return false
    return false;
  }

  public static void main(String[] args) {
    solveKT();
  }
}
