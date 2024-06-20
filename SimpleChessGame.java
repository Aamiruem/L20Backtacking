package L20BackTarcking;
// import java.util.Scanner;

// public class SimpleChessGame {

//   public static void printBoard(char[][] board) {
//     System.out.println("  a b c d e f g h");
//     System.out.println(" +----------------");
//     for (int i = 0; i < 8; i++) {
//       System.out.print(8 - i + "|");
//       for (int j = 0; j < 8; j++) {
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println("|" + (8 - i));
//     }
//     System.out.println(" +----------------");
//     System.out.println("  a b c d e f g h");
//   }

//   public static void initializeBoard(char[][] board) {
//     // Set up the initial chessboard configuration
//     // 'r' and 'R' represent black and white rooks, respectively
//     // 'k' and 'K' represent black and white kings, respectively
//     // '.' represents an empty square
//     board[0] = new char[] { 'r', ' ', ' ', ' ', ' ', ' ', ' ', 'r' };
//     board[1] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[2] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[3] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[4] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[5] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[6] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[7] = new char[] { 'R', ' ', ' ', ' ', ' ', ' ', ' ', 'R' };
//   }

//   public static void main(String[] args) {
//     char[][] board = new char[8][8];
//     initializeBoard(board);
//     Scanner scanner = new Scanner(System.in);

//     boolean whiteTurn = true;

//     while (true) {
//       printBoard(board);

//       // Get player input
//       System.out.println((whiteTurn ? "White" : "Black") + "'s turn");
//       System.out.print("Enter the move (e.g., 'e2 e4'): ");
//       String move = scanner.nextLine().trim().toLowerCase();

//       if (move.equals("exit")) {
//         System.out.println("Game over. Exiting.");
//         break;
//       }

//       // Process the move
//       int fromRow = 8 - (move.charAt(1) - '1');
//       int fromCol = move.charAt(0) - 'a';
//       int toRow = 8 - (move.charAt(4) - '1');
//       int toCol = move.charAt(3) - 'a';

//       if (
//         fromRow < 0 ||
//         fromRow >= 8 ||
//         fromCol < 0 ||
//         fromCol >= 8 ||
//         toRow < 0 ||
//         toRow >= 8 ||
//         toCol < 0 ||
//         toCol >= 8
//       ) {
//         System.out.println("Invalid move. Try again.");
//         continue;
//       }

//       char piece = board[fromRow][fromCol];

//       if (
//         (whiteTurn && Character.isUpperCase(piece)) ||
//         (!whiteTurn && Character.isLowerCase(piece))
//       ) {
//         System.out.println("Invalid move. Try again.");
//         continue;
//       }

//       board[fromRow][fromCol] = ' ';
//       board[toRow][toCol] = piece;

//       whiteTurn = !whiteTurn;
//     }

//     scanner.close();
//   }
// }

// import java.util.Scanner;

// public class SimpleChessGame {

//   public static void printBoard(char[][] board) {
//     System.out.println("  a b c d e f g h");
//     System.out.println(" +----------------");
//     for (int i = 0; i < 8; i++) {
//       System.out.print(8 - i + "|");
//       for (int j = 0; j < 8; j++) {
//         printPiece(board[i][j]);
//       }
//       System.out.println("|" + (8 - i));
//     }
//     System.out.println(" +----------------");
//     System.out.println("  a b c d e f g h");
//   }

//   public static void printPiece(char piece) {
//     String color = (Character.isUpperCase(piece)) ? "\u001B[97m" : "\u001B[30m"; // White or Black piece
//     String pieceColor = (Character.isUpperCase(piece))
//       ? "\u001B[43m"
//       : "\u001B[47m"; // Yellow or White background

//     System.out.print(pieceColor + color + piece + " \u001B[0m"); // Reset color
//   }

//   public static void initializeBoard(char[][] board) {
//     // Set up the initial chessboard configuration
//     board[0] = new char[] { 'r', ' ', ' ', ' ', ' ', ' ', ' ', 'r' };
//     board[1] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[2] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[3] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[4] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[5] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[6] = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
//     board[7] = new char[] { 'R', ' ', ' ', ' ', ' ', ' ', ' ', 'R' };
//   }

//   public static void main(String[] args) {
//     char[][] board = new char[8][8];
//     initializeBoard(board);
//     Scanner scanner = new Scanner(System.in);

//     boolean whiteTurn = true;

//     while (true) {
//       printBoard(board);

//       System.out.println((whiteTurn ? "White" : "Black") + "'s turn");
//       System.out.print("Enter the move (e.g., 'e2 e4'): ");
//       String move = scanner.nextLine().trim().toLowerCase();

//       if (move.equals("exit")) {
//         System.out.println("Game over. Exiting.");
//         break;
//       }

//       int fromRow = 8 - (move.charAt(1) - '1');
//       int fromCol = move.charAt(0) - 'a';
//       int toRow = 8 - (move.charAt(4) - '1');
//       int toCol = move.charAt(3) - 'a';

//       if (
//         fromRow < 0 ||
//         fromRow >= 8 ||
//         fromCol < 0 ||
//         fromCol >= 8 ||
//         toRow < 0 ||
//         toRow >= 8 ||
//         toCol < 0 ||
//         toCol >= 8
//       ) {
//         System.out.println("Invalid move. Try again.");
//         continue;
//       }

//       char piece = board[fromRow][fromCol];

//       if (
//         (whiteTurn && Character.isUpperCase(piece)) ||
//         (!whiteTurn && Character.isLowerCase(piece))
//       ) {
//         System.out.println("Invalid move. Try again.");
//         continue;
//       }

//       board[fromRow][fromCol] = ' ';
//       board[toRow][toCol] = piece;

//       whiteTurn = !whiteTurn;
//     }

//     scanner.close();
//   }
// }
