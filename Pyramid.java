package L20BackTarcking;
// import java.util.*;

// public class Pyramid {
//     public static void main(String[] args) {
//         for (int i = 0; i  <  5; i++) {
//             // Print spaces
//             for (int j = 5; j  >  i; j--) {
//                 System.out.print(" ");
//             }
//             // Print asterisks
//             for (int k = 0; k  <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// output:-

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

public class Pyramid {

  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // Print spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // Print asterisks
      for (int j = i; j < 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
// output:-
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
