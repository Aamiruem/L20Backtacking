// public class FindSubsets {
//     public static void findSubsets(String str, String ans, int i) {
//         // base case
//         if (i == str.length()) {
//             System.out.print(" [" + ans.trim() + "] "); // trim is used to remove extra space at the end of the string 
//             return;
//         }
//         // recursion
//         // yes choice
//         findSubsets(str, ans + " " + str.charAt(i), i + 1); // charAt is used to get the character at a specific index of the string

//         // no choice
//         findSubsets(str, ans, i + 1); // increment index to move to the next character in the string
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, " ", 0);
//     }
// }


// Time complexity: O(n*n!) where n is the length of the string and n! is the factorial of n. The time complexity is exponential in the length of the string.

// Space complexity: O(n) where n is the length of the string. The space complexity is linear in the length of the string.

// package L20BackTarcking;

public class FindSubsets {

    public static void findSubsets(String str, String ans, int i) {
        // base case: if index reaches the length of the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print(" null ");
            } else {
                System.out.println(" " + ans + " ");
            }
            return;
        }

        

        // yes choice - include current character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // no choice - do not include current character
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0); // Start with an empty subset
    }
}
