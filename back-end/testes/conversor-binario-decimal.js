var str = '1000'

var tam = str.split('').length-1
console.log(tam)
const newStr = str.split('').map((num,index) => tam > index ? num*(2**(tam-index)):num*1);
console.log(newStr)
console.log(newStr.reduce((acum,atual) => acum + atual));