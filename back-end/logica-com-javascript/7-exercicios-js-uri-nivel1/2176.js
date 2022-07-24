var teclado = require('prompt-sync')();


var s = teclado().split('');

const newS = s.filter(n => n  > 0);
console.log(newS);
console.log(s)

 if(newS.length % 2 === 0) {
     s.push(0);
     console.log(s.join(''));
 }else {
     s.push(1);
     console.log(s.join(''));
 }