/*
  Quantificadores

  {n} = Quantifica um numero especifico
  {n, } = Quantifica um numero minimo
  {n,m} = Quantifica um número minimo e um maximo
*/

var regExp = /^\([0-9]{2}\) [0-9]{4}-[0-9]{4}$/;
var telefone = '(51) 9862-1234'

console.log(regExp.test(telefone)) // retorna true or false

/*
Se por acaso quisermos aceitar números com 8 e também com 9 dígitos, podemos definir o quantificador de minimo e maximo como no exemplo abaixo:
*/

var regExp = /^\([0-9]{2}\) [0-9]{4,5}-[0-9]{4}$/;
var telefone = '(51) 99862-1234'
console.log(regExp.test(telefone)) // retorna true or false