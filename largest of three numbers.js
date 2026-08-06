let a = parseInt(prompt("Enter first number:"), 10);
let b = parseInt(prompt("Enter second number:"), 10);
let c = parseInt(prompt("Enter third number:"), 10);
let largest = a;
if (b > largest) {
  largest = b;
}
if (c > largest) {
  largest = c;
}
console.log("Largest = " + largest);

output:
Enter first number:8
Enter second number:5
Enter third number:9
Largest = 9

Enter first number:8
Enter second number:3
Enter third number:2
Largest = 8

Enter first number:3
Enter second number:5
Enter third number:12
Largest = 12

