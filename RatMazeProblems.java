// package L20BackTarcking;
// public class RatMazeProblem {

//   // Method to print the solution matrix
//   public static void printMaze(int sol[][]) {
//     for (int i = 0; i < sol.length; i++) {
//       for (int j = 0; j < sol.length; j++) {
//         System.out.print(" " + sol[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   // Method to check if (x, y) is a valid position in the maze
//   public static boolean isSafe(int maze[][], int x, int y) {
//     // Check if (x, y) is within the maze boundaries and is not blocked (maze[x][y] == 1)
//     return (
//       x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1
//     );
//   }

//   // Main method to solve the maze and print the solution
//   public static boolean solveMaze(int maze[][]) {
//     int N = maze.length;
//     int sol[][] = new int[N][N]; // Initialize the solution matrix

//     // Call the utility method to solve the maze starting from the top-left corner
//     if (solveMazeUtil(maze, 0, 0, sol) == false) {
//       System.out.println("Solution doesn't exist");
//       return false;
//     }

//     // Print the solution matrix
//     printMaze(sol);
//     return true;
//   }

//   // Utility method to solve the maze using backtracking
//   public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
//     // If the destination is reached, return true
//     if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
//       sol[x][y] = 1;
//       return true;
//     }

//     // Check if the current position (x, y) is valid
//     if (isSafe(maze, x, y) == true) {
//       // If the current position is already part of the solution, return false
//       if (sol[x][y] == 1) return false;

//       // Mark the current position as part of the solution
//       sol[x][y] = 1;

//       // Recursively check the paths from the current position
//       if (solveMazeUtil(maze, x + 1, y, sol)) return true;
//       if (solveMazeUtil(maze, x, y + 1, sol)) return true;

//       // If none of the paths lead to the destination, backtrack
//       sol[x][y] = 0;
//       return false;
//     }
//     return false;
//   }

//   public static void main(String args[]) {
//     int maze[][] = {
//       { 1, 0, 0, 0 },
//       { 1, 1, 0, 1 },
//       { 0, 1, 0, 0 },
//       { 1, 1, 1, 1 },
//     };

//     // Solve the maze and print the solution
//     solveMaze(maze);
//   }
// }

// public class RatMazeProblem {

//   public static void printMaze(int sol[][]) {
//     for (int i = 0; i < sol.length; i++) {
//       for (int j = 0; j < sol[i].length; j++) {
//         System.out.print(" " + sol[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static boolean isSafe(int maze[][], int x, int y) {
//     return (
//       x >= 0 &&
//       x < maze.length &&
//       y >= 0 &&
//       y < maze[0].length &&
//       maze[x][y] == 1
//     );
//   }

//   public static boolean solveMaze(int maze[][]) {
//     int N = maze.length;
//     int sol[][] = new int[N][N];
//     if (solveMazeUtil(maze, 0, 0, sol) == false) {
//       System.out.println("Solution does not exist");
//       return false;
//     }
//     printMaze(sol);
//     return true;
//   }

//   public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
//     if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
//       sol[x][y] = 1;
//       return true;
//     }

//     // Check if the current position is valid and not part of the solution
//     if (isSafe(maze, x, y) && sol[x][y] == 0) {
//       sol[x][y] = 1; // Mark the current position as part of the solution

//       // Move right or down
//       if (
//         solveMazeUtil(maze, x + 1, y, sol) || solveMazeUtil(maze, x, y + 1, sol)
//       ) {
//         return true;
//       }

//       sol[x][y] = 0; // If moving right or down doesn't lead to a solution, backtrack
//       return false;
//     }

//     return false;
//   }

//   public static void main(String[] args) {
//     int maze[][] = {
//       { 1, 0, 0, 0 },
//       { 1, 1, 0, 1 },
//       { 0, 1, 0, 0 },
//       { 1, 1, 1, 1 },
//     };

//     solveMaze(maze);
//   }
// }

// public class RatMazeProblem {

//   public static void printMaze(int sol[][]) {
//     for (int i = 0; i < sol.length; i++) {
//       for (int j = 0; j < sol.length; j++) {
//         System.out.print(" " + sol[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static boolean isSafe(int maze[][], int x, int y) {
//     return (
//       x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1
//     );
//   }

//   public static boolean solveMaze(int maze[][]) {
//     int N = maze.length;
//     int sol[][] = new int[N][N];
//     if (solveMazeUtil(maze, 0, 0, sol) == false) {
//       System.out.println("solution does not exist");
//       return false;
//     }
//     printMaze(sol);
//     return true;
//   }

//   public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
//     if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
//       sol[x][y] = 1;
//       return true;
//     }
//     //if check maze [x][y]y is valid
//     if (isSafe(maze, x, y) == true) {
//       if (sol[x][y] == 1) {
//         return false;
//       }
//       sol[x][y] = 1;

//       if (solveMazeUtil(maze, x + 1, y, sol)) {
//         return true;
//       }

//       if (solveMazeUtil(maze, x, y + 1, sol)) {
//         return true;
//       }
//       sol[x][y] = 0;
//       return false;
//     }
//     return false;
//   }

//   public static void main(String[] args) {
//     int maze[][] = {
//       { 1, 0, 0, 0 },
//       { 1, 1, 0, 1 },
//       { 0, 1, 0, 0 },
//       { 1, 1, 1, 1 },
//     };

//     solveMaze(maze);
//   }
// }








// Define a public class named RatMazeProblems
public class RatMazeProblems {

  // A static method to print the solution matrix
  public static void printMaze(int sol[][]) {
    // Loop through each row
    for (int i = 0; i < sol.length; i++) {
      // Loop through each column
      for (int j = 0; j < sol.length; j++) {
        // Print the element at position [i][j] with space
        System.out.print(" " + sol[i][j] + " ");
      }
      // Move to next line after printing each row
      System.out.println();
    }
  }

  // Method to check if current x, y position is safe to move to
  public static boolean isSafe(int maze[][], int x, int y) {
    // Returns true only if x and y are within bounds of the maze and cell is 1
    // (open)
    return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
  }

  // Main function to solve the maze
  public static boolean solveMaze(int maze[][]) {
    int N = maze.length; // Size of maze (N x N)
    int sol[][] = new int[N][N]; // Initialize a solution matrix with 0s

    // Call utility to solve maze starting from (0, 0)
    if (solveMazeUtil(maze, 0, 0, sol) == false) {
      System.out.println("Solution does not exist"); // If no path found
      return false; // Return false
    }

    printMaze(sol); // If path found, print the solution matrix
    return true; // Return true
  }

  // Recursive utility to solve the maze
  public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
    // If destination (bottom-right) is reached and it's not blocked
    if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
      sol[x][y] = 1; // Mark destination in solution matrix
      return true; // Return true since destination reached
    }

    // Check if current cell is valid to move
    if (isSafe(maze, x, y) == true) {
      // If already part of solution path, return false to avoid loops
      if (sol[x][y] == 1) {
        return false;
      }

      sol[x][y] = 1; // Mark current cell as part of solution path

      // Move down in the maze (x+1)
      if (solveMazeUtil(maze, x + 1, y, sol)) {
        return true; // Return true if path is found going down
      }

      // Move right in the maze (y+1)
      if (solveMazeUtil(maze, x, y + 1, sol)) {
        return true; // Return true if path is found going right
      }

      // If both directions fail, backtrack: unmark current cell
      sol[x][y] = 0;
      return false; // Return false, no path from current cell
    }

    return false; // If cell is not safe
  }

  // Main method to run the program
  public static void main(String[] args) {
    // Define a 4x4 maze (1 = open path, 0 = blocked)
    int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 }, };

    // Call the method to solve the maze
    solveMaze(maze);
  }
}
