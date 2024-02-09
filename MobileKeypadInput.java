// public class MobileKeypadInput {

//   // Mapping of digits to corresponding letters
//   static final char[][] L = {
//     {},
//     {},
//     { 'a', 'b', 'c' },
//     { 'd', 'e', 'f' },
//     { 'g', 'h', 'i' },
//     { 'j', 'k', 'l' },
//     { 'm', 'n', 'o' },
//     { 'p', 'q', 'r', 's' },
//     { 't', 'u', 'v' },
//     { 'w', 'x', 'y', 'z' },
//   };

//   // Main method to generate letter combinations
//   public static void letterCombinations(String D) {
//     int len = D.length();

//     // If the input string is empty, print an empty string
//     if (len == 0) {
//       System.out.println("");
//       return;
//     }

//     // Start the breadth-first search (BFS) to generate combinations
//     bfs(0, len, new StringBuilder(), D);
//   }

//   // Breadth-first search (BFS) to generate letter combinations
//   public static void bfs(int pos, int len, StringBuilder sb, String D) {
//     // If the position reaches the length of the input string, print the combination
//     if (pos == len) {
//       System.out.println(sb.toString());
//     } else {
//       // Get the letters corresponding to the current digit
//       char[] letters = L[Character.getNumericValue(D.charAt(pos))];

//       // Explore all possible combinations by appending each letter and recursively calling BFS
//       for (int i = 0; i < letters.length; i++) {
//         bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
//       }
//     }
//   }

//   public static void main(String args[]) {
//     // Example usage with the input "2"
//     System.out.print("This is the first input 23 = ");
//     letterCombinations("23");
//     System.out.print("This is the second input 2 = ");
//     letterCombinations("2");
//     System.out.print("This is the third input NULL = ");
//     letterCombinations("");
//   }
// }

public class MobileKeypadInput {

  static final char[][] L = {
    {},
    {},
    { 'a', 'b', 'c' },
    { 'd', 'e', 'f' },
    { 'g', 'h', 'i' },
    { 'j', 'k', 'l' },
    { 'm', 'n', 'o' },
    { 'p', 'q', 'r', 's' },
    { 't', 'u', 'v' },
    { 'w', 'x', 'y', 'z' },
  };

  public static void letterCombinations(String D) {
    int len = D.length();
    if (len == 0) {
      System.out.print("");
      return;
    }
    bsf(0, len, new StringBuilder(), D);
  }

  public static void bsf(int pos, int len, StringBuilder sb, String D) {
    if (pos == len) {
      System.out.println(sb.toString());
    } else {
      char[] letters = L[Character.getNumericValue(D.charAt(pos))];
      for (int i = 0; i < letters.length; i++) {
        bsf(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("letterCombinations 23 =  ");
    letterCombinations("23");
    System.out.println("letterCombinations 2 =  ");
    letterCombinations("2");
  }
}
