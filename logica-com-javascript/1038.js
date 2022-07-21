var teclado = require('prompt-sync')();

var en = teclado().split(" ");

var c = Number(en.shift());
var q = Number(en.shift());

var p = [4.00, 4.50, 5.00, 2.00, 1.50];

var result = (p[c-1]*q).toFixed(2);
console.log(`Total: R$ ${result}`);