let displayValue = '';
let resultValue = '';

function appendNumber(number) {
    displayValue += number;
    updateDisplay();
}

function appendOperator(operator) {
    displayValue += operator;
    updateDisplay();
}

function clearDisplay() {
    displayValue = '';
    resultValue = '';
    updateDisplay();
}

function calculate() {
    try {
        resultValue = eval(displayValue).toString();
    } catch (error) {
        resultValue = 'Error';
    }
    updateResult();
}

function updateDisplay() {
    document.getElementById('display').value = displayValue;
}

function updateResult() {
    document.getElementById('result').value = resultValue;
}
