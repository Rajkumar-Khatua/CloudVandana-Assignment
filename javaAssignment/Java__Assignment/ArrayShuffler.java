// Package declaration for the class to be in the "Java__Assignment" package
package Java__Assignment;

// Import statements for required classes
import java.util.Arrays;  // Import Arrays class for array manipulation
import java.util.Random;  // Import Random class for generating random numbers

// Class definition for ArrayShuffler
public class ArrayShuffler {

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array with values 1 through 7
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Step 2: Call the shuffleArray method to shuffle the elements of the array
        shuffleArray(array);

        // Step 3: Print the shuffled array using Arrays.toString method
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    // Method to shuffle the elements of an array
    private static void shuffleArray(int[] array) {
        // Step 4: Create a Random object to generate random numbers
        Random rand = new Random();

        // Step 5: Iterate through the array in reverse order
        for (int i = array.length - 1; i > 0; i--) {
            // Step 6: Generate a random index between 0 and i (inclusive)
            int index = rand.nextInt(i + 1);

            // Step 7: Swap the elements at the randomly chosen index and the current index
            // This uses the Fisher-Yates shuffle algorithm
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
