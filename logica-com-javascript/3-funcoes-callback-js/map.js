var notas = [10,9,8,7,6]

/*
//Transformando um array de string em um array de numbers com o Método map

var num = n.toString().split('');
var num2 = num.map(Number);
console.log(num);
console.log(num2);
*/
/*
  O método map consegue acessar cada um dos elemtnos do array e fazer uma alteração;
  o método map possui retorno, por isso é necessário ter uma const para receber o retorno do novo array atualizado.
  Essa é a principal diferença entre o método forEach e o map, a questão do retorno.
*/

// Utilizando o map().
const notasA = notas.map(nota => nota**2)
console.log(notasA);

// Utilizando o forEach().
var newArr = [];
notas.forEach((nota,index) => newArr[index] = nota **2);
console.log(newArr)

