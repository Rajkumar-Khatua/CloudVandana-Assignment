function reverseWords(sentence) {
    // Step 1: Split the sentence into an array of words
    const words = sentence.split(' ');

    // Step 2: Reverse each word in the array
    const reversedWords = words.map(word => reverseString(word));

    // Step 3: Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    // Step 4: Return the reversed sentence
    return reversedSentence;
}

// Helper function to reverse a string
function reverseString(str) {
    return str.split('').reverse().join('');
}

// Example usage
const inputSentence = "This is a sunny day";
const reversedResult = reverseWords(inputSentence);
console.log(reversedResult);
