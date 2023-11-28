
package Java__Assignment;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerConverter {

    public static void main(String[] args) {
        // Step 1: Define a Roman numeral as a string
        String romanNumeral = "IX";

        // Step 2: Call the romanToInteger method to convert the Roman numeral to an integer
        int result = romanToInteger(romanNumeral);

        // Step 3: Print the result
        System.out.println("Integer value of " + romanNumeral + " is: " + result);
    }

    // Method to convert a Roman numeral to an integer
    private static int romanToInteger(String s) {
        // Step 4: Create a map to store the values of Roman numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Step 5: Initialize the result variable to store the final integer value
        int result = 0;

        // Step 6: Iterate through each character in the Roman numeral
        for (int i = 0; i < s.length(); i++) {
            // Step 7: Get the integer value of the current Roman numeral character
            int currentVal = romanMap.get(s.charAt(i));

            // Step 8: Get the integer value of the next Roman numeral character, or 0 if it doesn't exist
            int nextVal = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            // Step 9: Compare the current and next values
            if (currentVal < nextVal) {
                // If the current value is less than the next value, subtract it from the result
                result += nextVal - currentVal;
                // Skip the next character as it has already been considered
                i++;
            } else {
                // If the current value is greater than or equal to the next value, add it to the result
                result += currentVal;
            }
        }

        // Step 10: Return the final result
        return result;
    }
}
