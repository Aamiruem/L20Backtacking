//todo Class representing the Mobile Keypad functionality
public class MobilesKeypadInputs {

    //? A 2D character array storing the mapping of digits (2-9) to corresponding letters on a mobile keypad
    // Index 0 and 1 are empty because digits 0 and 1 don't map to any letters in a traditional phone keypad
    static final char[][] keypadLetters = {
            {},                      // 0 -> no letters
            {},                      // 1 -> no letters
            { 'a', 'b', 'c' },       // 2 -> a, b, c
            { 'd', 'e', 'f' },       // 3 -> d, e, f
            { 'g', 'h', 'i' },       // 4 -> g, h, i
            { 'j', 'k', 'l' },       // 5 -> j, k, l
            { 'm', 'n', 'o' },       // 6 -> m, n, o
            { 'p', 'q', 'r', 's' },  // 7 -> p, q, r, s
            { 't', 'u', 'v' },       // 8 -> t, u, v
            { 'w', 'x', 'y', 'z' }   // 9 -> w, x, y, z
    };

    //! Function to initiate the generation of all possible letter combinations from the input digit string
    public static void letterCombination(String digits){
        int length = digits.length(); // Get the total number of digits in the input string
        if(length == 0){
            System.out.println(" ");  // If input is empty, just print a space and return
        }

        // Start the recursive backtracking process to build combinations
        backtrack(0, length, new StringBuilder(), digits);
    }

    // Recursive function to generate all combinations of letters for the given digits
    public static void backtrack(int position, int length, StringBuilder sb, String digits){
        if(position == length){
            //! Base case: if the current position reaches the length, we’ve formed a full combination
            System.out.println(sb.toString());  // Print the current combination
        }
        else{
            // Get the array of characters for the current digit from the keypadLetters array
            char letters[] = keypadLetters[Character.getNumericValue(digits.charAt(position))]; // Convert the character at the current position to its numeric value and get corresponding letters 

            //? Loop through each character mapped to the current digit
            for(char letter: letters){
                sb.append(letter);  // Add the current character to the combination
                backtrack(position + 1, length, sb, digits); // Recurse to build the next character
                sb.deleteCharAt(sb.length() - 1); // Backtrack: remove the last character and try next
            }
        }
    }

    // Main method — entry point of the program
    public static void main(String[] args) {
        System.out.println("letters combination for 23");
        letterCombination("23");  // Example input "23" → prints all combinations like "ad", "ae", "af", etc.

        System.out.println("letters combination for 2");
        letterCombination("2");   // Example input "2" → prints "a", "b", "c"
    }
}
