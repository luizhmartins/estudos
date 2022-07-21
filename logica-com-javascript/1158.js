var teclado = require('prompt-sync')();


function digits() {
  var arrDigit = teclado().split(" ");
  console.log(arrDigit)
  return arrDigit;
}
var n = Number(teclado());
var res = 0; 
var inc = 0;

for(let i = 0; i < n; i++) {
  var input = digits();
  var x = Number(input.shift());
  console.log(`VALOR DE X = ${x}`)
  var y = Number(input.shift());
  console.log(`VALOR DE Y = ${y}`)

  if(x % 2 === 0) {
    console.log(`ENTROU NO IF`)
      res = x+1; 
      inc = res;
      console.log(`VALOR DE RES = ${res}`)
      console.log(`VALOR DE INC = ${inc}`)
      for(let j = 1; j < y; j++) {
          res+=(inc+=2);
      }
    console.log(res)
  }else {
    console.log(`ENTROU NO ELSE`)
      res = x; 
      inc = res;
      console.log(`VALOR DE RES = ${res}`)
      console.log(`VALOR DE INC = ${inc}`)
      for(let k = 1; k < y; k++) {
          res+=(inc+=2);
      }
    console.log(res)
  }
}