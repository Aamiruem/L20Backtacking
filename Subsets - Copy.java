package L20BackTarcking;
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

public class Subsets {

  public static void findSubsets(String str, String ans, int i) {
    // base case
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.print("null");
      } else {
        System.out.print(ans);
      }
      return;
    }
    // recursion
    // yes choice
    findSubsets(str, ans + str.charAt(i), i + 1);

    // no choice
    findSubsets(str, ans, i + 1);
  }

  public static void main(String[] args) {
    String str = "abc";
    findSubsets(str, " ", 0);
  }
}
