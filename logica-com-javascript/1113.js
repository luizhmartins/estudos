var teclado = require('prompt-sync')();


function digit() {
  var en = teclado().split(" ");
  return en;
}

do {
  var input = digit();
  var x = Number(input.shift());
  var y = Number(input.shift());
  if(x < y) {
      console.log('Crescebte');
  }else if(x > y) {
      console.log('Decrescente');
  }
}while(x != y)