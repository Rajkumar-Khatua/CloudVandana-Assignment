function sortDescending(arr) {
    // Step 1: Use the Array.sort() method with a custom comparator function
    arr.sort(function(a, b) {
        // Compare b with a to sort in descending order
        return b - a;
    });

    // Step 2: Return the sorted array
    return arr;
}

// Example usage
const inputArray = [5, 2, 8, 1, 3];
const sortedResult = sortDescending(inputArray);
console.log(sortedResult);
