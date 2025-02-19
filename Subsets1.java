// package L20BackTarcking;
// public class Subsets {

//   public static void findSubsets(String str, String ans, int i) {
//     // base case
//     if (i == str.length()) {
//       System.out.print(" [" + ans.trim() + "] ");
//       return;
//     }
//     // recursion
//     // yes choice
//     findSubsets(str, ans + " " + str.charAt(i), i + 1);

//     // no choice
//     findSubsets(str, ans, i + 1);
//   }

//   public static void main(String[] args) {
//     String str = "abc";
//     findSubsets(str, " ", 0);
//   }
// }












// Define a public class named Subsets1
public class Subsets1 {

  // Define a static method named findSubsets that takes a string (str), a string
  // (ans), and an integer (i)
  public static void findSubsets(String str, String ans, int i) {
    // Base case: If the current index (i) equals the length of the string (str),
    // print the subset (ans)
    if (i == str.length()) {
      // If the subset (ans) is empty, print "null" to represent the empty subset
      if (ans.length() == 0) {
        System.out.print("null");
      } else {
        // Otherwise, print the subset (ans)
        System.out.print(ans);
      }
      // Print a newline to separate subsets
      System.out.println();
      return; // Exit the current recursive call
    }

    // Recursive case:
    // "Yes" choice: Include the current character (str.charAt(i)) in the subset
    // (ans)
    findSubsets(str, ans + str.charAt(i), i + 1);

    // "No" choice: Exclude the current character (str.charAt(i)) from the subset
    // (ans)
    findSubsets(str, ans, i + 1);
  }

  // Main method: Entry point of the program
  public static void main(String[] args) {
    // Define a string (str) with the value "abc"
    String str = "abc";

    // Call the findSubsets method with the string (str), an empty subset (" "), and
    // starting index (0)
    findSubsets(str, "", 0);
  }
}
