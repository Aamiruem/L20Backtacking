// package L20BackTarcking;

// Define a public class named ArraysBacktrackings
public class ArraysBacktrackings {

  // Define a static method named changeArr that takes an array (arr), an index
  // (i), and a value (val)
  public static void changeArr(int arr[], int i, int val) {
    // Base case: If the index (i) reaches the length of the array, print the array
    // and return
    if (i == arr.length) {
      printArr(arr); // Call the printArr method to print the array
      return; // Exit the current recursive call
    }

    // Recursive case:
    // Assign the current value (val) to the array at index (i)
    arr[i] = val;

    // Recursively call changeArr with the next index (i + 1) and incremented value
    // (val + 1)
    changeArr(arr, i + 1, val + 1); // This builds the array step by step

    // Backtracking step: After the recursive call returns, modify the array at
    // index (i)
    arr[i] = arr[i] - 2; // Subtract 2 from the current value at index (i)
  }

  // Define a static method named printArr that takes an array (arr) and prints
  // its elements
  public static void printArr(int arr[]) {
    // Loop through the array and print each element
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // Print the current element followed by a space
    }
    System.out.println(); // Print a newline after printing the entire array
  }

  // Main method: Entry point of the program
  public static void main(String[] args) {
    // Create an integer array of size 5 (all elements initialized to 0 by default)
    int arr[] = new int[5];

    // Call the changeArr method with the array, starting index (0), and initial
    // value (2)
    changeArr(arr, 0, 2);

    // Print the final state of the array after all recursive and backtracking steps
    printArr(arr);
  }
}
