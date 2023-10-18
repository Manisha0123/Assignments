let s="This is a sunny day"
let rev=" ";
for (let i = 0; i < s.length; i++) {
   rev=s.charAt(i)+rev;
}
let result=rev.split(" ").reverse().join(" ");
console.log(result);
