/*
  Grupos de Caracteres

  [abc] = Aceita qualquer caractere dentro do grupo, nesse case a, b e c

  [^abc] = Não aceita qualquer caractere dentro do grupo, nesse case a, b ou c.

  [0-9] = Aceita qualquer caractere entre 0 e 9.

  [^0-9] = Não aceita qualquer caractere entre 0 e 9
*/
var regExp = /^\([0-9][0-9]\) [0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]$/;
var telefone = '(51) 9862-1234'

console.log(regExp.test(telefone)) // retorna true or false
console.log(regExp.exec(telefone)) // retorna mais informações