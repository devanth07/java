// 1. Prime Number Check
function primeCheck(n) {
    if (n <= 1) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}


// 2. Greatest Common Divisor (GCD)
function gcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}


// 3. Least Common Multiple (LCM)
function lcm(a, b) {
    return Math.abs(a * b) / gcd(a, b);
}


// 4. Factorial Using Method
function factorial(n) {
    let fact = 1;
    for (let i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}


// 5. Fibonacci Series Using Recursion
function fibonacci(n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
function fibonacciSeries(n) {
    let result = [];
    for (let i = 0; i < n; i++) {
        result.push(fibonacci(i));
    }
    return result;
}

// 6. Character Frequency Counter
function characterFrequency(str) {
let frequency = {};
    for (let char of str) {
        if (frequency[char]) {
            frequency[char]++;
        } else {
            frequency[char] = 1;
        }
    }
    return frequency;
}


// 7. Remove Duplicate Characters
function removeDuplicates(str) {
    let result = "";
    for (let char of str) {
        if (!result.includes(char)) {
            result += char;
        }
    }
    return result;
}

// 8. Array Sorting Without Built-in Methods
function sortArray(arr) {
    let a = [...arr];
    for (let i = 0; i < a.length - 1; i++) {
        for (let j = 0; j < a.length - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                let temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    return a;
}


// 9. Matrix Addition and Multiplication

function matrixAddition(A, B) {
    let rows = A.length;
   let cols = A[0].length;
    let result = [];
    for (let i = 0; i < rows; i++) {
        result[i] = [];
        for (let j = 0; j < cols; j++) {
            result[i][j] = A[i][j] + B[i][j];
        }
    }
    return result;
}
function matrixMultiplication(A, B) {
    let rowsA = A.length;
    let colsA = A[0].length;
    let rowsB = B.length;
    let colsB = B[0].length;
    if (colsA !== rowsB) {
        return "Matrix multiplication is not possible";
    }
    let result = [];
    for (let i = 0; i < rowsA; i++) {
        result[i] = [];
        for (let j = 0; j < colsB; j++) {
            result[i][j] = 0;
            for (let k = 0; k < colsA; k++) {
                result[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    return result;
}


// 10. XOR Encryption and Decryption
function xorEncrypt(text, key) {
    let encrypted = "";
    for (let i = 0; i < text.length; i++) {
        encrypted += String.fromCharCode(
            text.charCodeAt(i) ^ key
        );
    }
    return encrypted;
}
function xorDecrypt(encryptedText, key) {
    return xorEncrypt(encryptedText, key);
}
