const notas = [10,9,8,7,6]

/*
  O método reduce, tem dois parametros, o acumulador e o atual
  Acumulador = é o valor acumulado do calculo dentro dos valores do array
  Atual = é o valor atual que está sendo iterado
  0 = é o valor que o acumulador irá iniciar
*/

// Comparação de um calculo de média utilizando reduce, forEach e map

const media = notas.reduce((acum, atual) => atual + acum,0) / notas.length
console.log(media)

var media2 = 0;
notas.forEach(nota => media2 += nota);
console.log(media2/notas.length)

var acumulador = 0;
const media3 = notas.map(nota => acumulador += nota);
console.log(acumulador/notas.length)

