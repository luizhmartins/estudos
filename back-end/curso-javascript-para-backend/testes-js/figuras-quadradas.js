var num = 6
var num2 = '1'
var result = 1;
var raiz = 0;
//console.log(num2.padEnd(num,'0'))
 if(num % 2 != 0 && num > 2) {
  raiz = parseInt(num2.padEnd(num,'0')); 
  console.log(Math.sqrt(raiz));
  }else if(num % 2 == 0 && num > 2) {
    raiz = parseInt(num2.padEnd(num,'0')); 
    raiz = Math.sqrt(raiz).toFixed(0);
    result *= raiz
    console.log(result)
      while(raiz.length < num) {
        console.log(num)
        console.log(raiz.length)
        raiz = result * result
        console.log(raiz)
        result++
        console.log(result)
      }
  }else if(num == 1 || num == 2) {
    if(num == 1) console.log(0)
    if(num == 2) console.log(4)
  }