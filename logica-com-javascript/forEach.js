var notas = [1,2,3,4,5,6];
var somatorio = 0;

/*
// Fazendo o calculo da media de notas com o for classico
 function somaNotas(notas) {
   for(let c=0; c<notas.length; c++) {
     somatorio += notas[c];
   }
   return somatorio;
 }
console.log(`Média de notas = ${somaNotas(notas)/notas.length}`);
*/

/*
  Fazendo o calculo da media de notas com o o método forEach
  Este método também é conhecido como método callback, porque o parametro passado para ele é uma função
  Existem outros métodos callback como: 
*/

//notas.forEach(function soma(nota){somatorio+=nota}); // Declaração de função

//notas.forEach(function(nota) {somatorio+=nota}); // Expressão de Função

notas.forEach(nota => somatorio+=nota);// Arrow Function
console.log(somatorio/notas.length);



