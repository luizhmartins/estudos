/*
  Quantificadores - Parte 2
    ? = Zero ou um
    * = Zero um mais
    + = Um ou mais

    Por exemplo, colocamos a ? após o ifem do numero de telefone, isso significa que o número pode ter ou não o ifem que da mesma maneira irá retornar true, observe o exemplo abaixo:
*/

var regExp = /^\([0-9]{2}\) [0-9]{4,5}-?[0-9]{4}$/;
var telefone = '(51) 998621234'
console.log(regExp.test(telefone)) // retorna true or false