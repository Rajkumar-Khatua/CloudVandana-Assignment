package Java__Assignment;

// Class definition for PangramChecker
public class PangramChecker {

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Step 1: Define a string as input
        String input = "The quick brown fox jumps over the lazy dog";

        // Step 2: Call the isPangram method to check if the input is a pangram
        boolean isPangram = isPangram(input);

        // Step 3: Print the result
        System.out.println("Is the input a pangram? " + isPangram);
    }

    // Method to check if a string is a pangram
    private static boolean isPangram(String s) {
        // Step 4: Create an array to keep track of visited letters (assuming only lowercase letters)
        boolean[] visited = new boolean[26];

        // Step 5: Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Step 6: Convert the current character to lowercase
            char c = Character.toLowerCase(s.charAt(i));

            // Step 7: Check if the character is a lowercase letter
            if ('a' <= c && c <= 'z') {
                // Step 8: Mark the corresponding position in the array as visited
                visited[c - 'a'] = true;
            }
        }

        // Step 9: Check if all letters have been visited at least once
        for (boolean b : visited) {
            if (!b) {
                // Step 10: If any letter is not visited, return false (not a pangram)
                return false;
            }
        }

        // Step 11: If all letters are visited, return true (it's a pangram)
        return true;
    }
}
