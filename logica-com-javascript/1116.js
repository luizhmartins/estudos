var teclado = require('prompt-sync')();

var n = teclado();
var output = [n];
var result = 0;

for(let c = 0; c < n; c++) {
    var x = teclado();
    var y = teclado();
    if(y == 0) {
      output[c] = 'divisao impossivel' 
    }else {
      result = (x/y).toFixed(1);
      output[c] = result;
    }
}
for(let c = 0; c < output.length; c++) {
  console.log(output[c])
}