/*
  Metacaracteres

  . = Representa qualquer caractere
  \w = Representa o conjuto [a-zA-Z0-9_]
  \W = Representa o conjuto [^a-zA-Z0-9_]
  \d = Representa o conjuto [0-9]
  \D = Representa o conjuto [^0-9]
  \s = Representa um espaçõ em branco
  \S = Representa um não espaço em branco
  \n = Representa uma quebra de linha
  \t = Representa um tab

  No exemplo abaixo foi substituido todos os conjuntos [0-9] por \d e o espaco que havia os parenteses e o numeros foi substituido por \s.
*/

var regExp = /^\(\d{2}\)\s\d{4,5}-?\d{4}$/;
var telefone = '(51) 998621234'
console.log(regExp.test(telefone)) // retorna true or false