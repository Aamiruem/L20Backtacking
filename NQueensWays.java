public class NQueensWays {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Base case: all queens are placed
        if (row == board.length) {
            printBoard(board);
            return true;
        }
        // Try placing queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                } // Recur for the next row
                board[row][j] = 'x'; // Backtrack: undo the placement
            }
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (char[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Change this to the desired size of the chessboard
        char board[][] = new char[n][n];
        // Initialize the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {// Start placing queens from the first row
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
