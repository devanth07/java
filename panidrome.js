
let str = prompt("Enter a string:");
let reversed = str.split("").reverse().join("");

if (str === reversed) {
  console.log(str + " is a Palindrome");
} else {
  console.log(str + " is Not a Palindrome");
}


 Input: madam
   Output: madam is a Palindrome
