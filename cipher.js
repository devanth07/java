let message = prompt("Enter a message:");
let alphabet = "abcdefghijklmnopqrstuvwxyz";
let result = "";
message = message.toLowerCase();
for (let ch of message) {
    let index = alphabet.indexOf(ch);
    if (index !== -1) {
        let newIndex = (index + 3) % 26;
        result += alphabet[newIndex];
    } else {
        result += ch; 
    }
}
console.log("Encrypted Message: " + result);


output:
Enter a message:welcome
Encrypted message = zhofrph

Enter a message:kishore
Encrypted message = nlvkruh
