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
let number = Number(prompt("Enter a number:"));
if (primeCheck(number)) {
    console.log(number + " is a prime number");
} else {
    console.log(number + " is not a prime number");
}

OUTPUT:
Enter a number:67
67 is a prime number

Enter a number:56
56 is not a prime number

Enter a number:52
52 is not a prime number

// 2. Greatest Common Divisor (GCD)
function gcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
let num1 = Number(prompt("Enter first number:"));
let num2 = Number(prompt("Enter second number:"));
let result = gcd(num1, num2);
console.log("GCD of " + num1 + " and " + num2 + " is " + result);

OUTPUT:
Enter first number:4
Enter second number:6
GCD of 4 and 6 is 2

Enter first number:33
Enter second number:3
GCD of 33 and 3 is 3

Enter first number:5
Enter second number:6
GCD of 5 and 6 is 1

// 3. Least Common Multiple (Lcm)
function gcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
function lcm(a, b) {
    return Math.abs(a * b) / gcd(a, b);
}
let num1 = Number(prompt("Enter first number:"));
let num2 = Number(prompt("Enter second number:"));
let result = lcm(num1, num2);
console.log("LCM of " + num1 + " and " + num2 + " is " + result);

OUTPUT:
Enter first number:4
Enter second number:6
LCM of 4 and 6 is 12

Enter first number:3 
Enter second number:2
LCM of 3 and 2 is 6

Enter first number:5 
Enter second number:10
LCM of 5 and 10 is 10

// 4. Factorial Using Method
function factorial(n) {
    let fact = 1;
    for (let i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
let num = Number(prompt("Enter first number:"));
let result = factorial(num);
console.log("Factorial of given number:" + result);

OUTPUT:
Enter first number:3
Factorial of given number:6

Enter first number:6
Factorial of given number:720

Enter first number:5
Factorial of given number:120

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
let num = Number(prompt("Enter first number:"));
let result = fibonacci(num);
console.log("Fibonacci of given number:" + result);

OUTPUT:
Enter first number:7
Fibonacci of given number:13

Enter first number:9
Fibonacci of given number:34

Enter first number:5
Fibonacci of given number:5


// 6. Character Frequency Counter
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
let text = prompt("Enter a string:");
let result = characterFrequency(text);
console.log("Character Frequency:", result);

OUTPUT:
Enter a string:hello
Character Frequency: { h: 1, e: 1, l: 2, o: 1 }

Enter a string:banana
Character Frequency: { b: 1, a: 3, n: 2 }

Enter a string:apple
Character Frequency: { a: 1, p: 2, l: 1, e: 1 }



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

let text = prompt("Enter a string:");
let result = removeDuplicates(text);
console.log("String after removing duplicates: " + result);

OUTPUT:

Enter a string:hello
String after removing duplicates: helo

Enter a string:banana
String after removing duplicates: ban

Enter a string:programming
String after removing duplicates: progamin


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

let input = prompt("Enter numbers separated by spaces:");
let numbers = input.split(" ").map(Number);
let result = sortArray(numbers);
console.log("Sorted Array: " + result);

OUTPUT:

Enter numbers separated by spaces:5 2 8 1 3
Sorted Array: 1,2,3,5,8

Enter numbers separated by spaces:10 4 7 2 9
Sorted Array: 2,4,7,9,10

Enter numbers separated by spaces:6 3 1 5 2
Sorted Array: 1,2,3,5,6



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
let A = [
    [1, 2],
    [3, 4]
];
let B = [
    [5, 6],
    [7, 8]
];
console.log("Matrix Addition:");
console.log(matrixAddition(A, B));
console.log("Matrix Multiplication:");
console.log(matrixMultiplication(A, B));

OUTPUT:
Matrix Addition:
[ [ 6, 8 ], [ 10, 12 ] ]

Matrix Multiplication:
[ [ 19, 22 ], [ 43, 50 ] ]


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
let text = prompt("Enter text:");
let key = Number(prompt("Enter encryption key:"));
let encrypted = xorEncrypt(text, key);
let decrypted = xorDecrypt(encrypted, key);
console.log("Original Text: " + text);
console.log("Encrypted Text: " + encrypted);
console.log("Decrypted Text: " + decrypted);

OUTPUT:
Enter text:hello
Enter encryption key:5

Original Text: hello
Encrypted Text: m`iij
Decrypted Text: hello


Enter text:hello
Enter encryption key:10

Original Text: hello
Encrypted Text: b o f f e
Decrypted Text: hello
