const str = 'Ola, meu nome É luiz';

console.log(str.indexOf('n')); // Retorna o indice 9

/*
  Procura um valor passado como parametro dentro da string que chamou, e retorna a primeira ocorrência encontrada.
  Se o valor passado não for encontrado dentro da string, o valor retornado é -1.
*/
var letra = 'a'
var palavra = 'abacaxi'

const indices = []
palavra.split('').forEach((letter,index) => letter === letra? indices.push(index):false)
console.log(indices)