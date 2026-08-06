let str = prompt("Enter a string:");
let count = 0;

for (let ch of str.toLowerCase()) {
  if ("aeiou".includes(ch)) {
    count++;
  }
}


Input: hello
Output: Number of vowels = 2
