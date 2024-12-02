package L20BackTarcking;


public class MobileKeypadInput {

  // Mapping of digits to corresponding letters
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

  // Main method to generate letter combinations
  public static void letterCombinations(String D) {
    int len = D.length();

    // If the input string is empty, print an empty string
    if (len == 0) {
      System.out.println("");
      return;
    }

    // Start the breadth-first search (BFS) to generate combinations
    bfs(0, len, new StringBuilder(), D);
  }

  // Breadth-first search (BFS) to generate letter combinations
  public static void bfs(int pos, int len, StringBuilder sb, String D) {
    // If the position reaches the length of the input string, print the combination
    if (pos == len) {
      System.out.println(sb.toString());
    } else {
      // Get the letters corresponding to the current digit
      char[] letters = L[Character.getNumericValue(D.charAt(pos))];

      // Explore all possible combinations by appending each letter and recursively
      // calling BFS
      for (int i = 0; i < letters.length; i++) {
        bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
      }
    }
  }

  public static void main(String args[]) {
    // Example usage with the input "2"
    System.out.print("This is the first input 23 = ");
    letterCombinations("23");
    System.out.print("This is the second input 2 = ");
    letterCombinations("2");
    System.out.print("This is the third input NULL = ");
    letterCombinations("");
  }
}

// public class MobilesKeypadInput {

// static final char[][] keypadLetters = {
// {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
// { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
// { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' }
// };

// public static void letterCombinations(String digits) {
// int length = digits.length();
// if (length == 0) {
// System.out.print(""); // No need for println here
// return;
// }
// if (!digits.matches("[2-9]+")) {
// System.out.println("Input contains invalid characters. Please provide digits
// 2 to 9 only.");
// return;
// }
// backtrack(0, length, new StringBuilder(), digits);
// }

// public static void backtrack(int position, int length, StringBuilder sb,
// String digits) {
// if (position == length) {
// System.out.print(sb.toString()); // No need for println here
// } else {
// char[] letters =
// keypadLetters[Character.getNumericValue(digits.charAt(position))];
// for (char letter : letters) {
// sb.append(letter);
// backtrack(position + 1, length, sb, digits);
// sb.deleteCharAt(sb.length() - 1); // Backtrack
// }
// }
// }

// public static void main(String[] args) {
// System.out.println("Letter Combinations for 23:");
// letterCombinations("23");
// System.out.println("\nLetter Combinations for 2:");
// letterCombinations("2");
// System.out.println("\nLetter Combinations for '2a3':");
// letterCombinations("2a3");
// }
// }
