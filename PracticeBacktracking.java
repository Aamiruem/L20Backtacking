public class PracticeBacktracking {

  public static void findAllPaths(
    int i,
    int j,
    int N,
    int[][] matrix,
    boolean[][] visited,
    String psf
  ) {
    if (i < 0 || j < 0 || i >= N || j >= N) {
      return;
    }
    if (matrix[i][j] == 0 || visited[i][j] == true) {
      return;
    }

    if (i == N - 1 && j == N - 1) {
      System.out.println("Reached destination with path " + psf);
      return;
    }

    visited[i][j] = true;

    findAllPaths(i - 1, j, N, matrix, visited, psf + "U"); // up
    findAllPaths(i + 1, j, N, matrix, visited, psf + "D"); // down
    findAllPaths(i, j - 1, N, matrix, visited, psf + "L"); // left
    findAllPaths(i, j + 1, N, matrix, visited, psf + "R"); // right

    visited[i][j] = false; // you can visit this cell as part of some other path
  }

  public static void KnightPaths(
    int i,
    int j,
    int N,
    int[][] matrix,
    int moveNumber
  ) {
    if (i < 0 || j < 0 || i >= N || j >= N) {
      return;
    }
    if (matrix[i][j] != 0) { // we have been at this point before
      return;
    }

    matrix[i][j] = moveNumber;

    if (moveNumber == N * N - 1) {
      // print matrix here
      for (int x = 0; x < N; x++) {
        for (int y = 0; y < N; y++) {
          System.out.print(matrix[x][y] + " ");
        }
        System.out.println();
      }
      return;
    }

    KnightPaths(i - 2, j + 1, N, matrix, moveNumber + 1);
    KnightPaths(i - 1, j + 2, N, matrix, moveNumber + 1);
    KnightPaths(i + 1, j + 2, N, matrix, moveNumber + 1);
    KnightPaths(i + 2, j + 1, N, matrix, moveNumber + 1);
    KnightPaths(i + 2, j - 1, N, matrix, moveNumber + 1);
    KnightPaths(i + 1, j - 2, N, matrix, moveNumber + 1);
    KnightPaths(i - 1, j - 2, N, matrix, moveNumber + 1);
    KnightPaths(i - 2, j - 1, N, matrix, moveNumber + 1);

    matrix[i][j] = 0; // you can visit this cell as part of some other path
  }

  public static void main(String[] args) {
    int[][] matrix = {
      { 1, 1, 1, 1 },
      { 0, 1, 0, 1 },
      { 1, 1, 1, 1 },
      { 1, 0, 1, 1 },
    };
    int N = matrix.length;
    boolean[][] visited = new boolean[N][N];
    findAllPaths(0, 0, N, matrix, visited, "");
    KnightPaths(0, 0, 8, new int[8][8], 0);
  }
}
