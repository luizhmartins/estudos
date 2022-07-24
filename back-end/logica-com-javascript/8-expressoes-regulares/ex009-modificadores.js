/*
  Modificadores

  i = Case - insensitive matching ==> Não importa letras maiusculas ou minusculas em uma string

  g = Global matching ==> Percorrer toda a string, encontra todos os matches que contenham na string

  m = Multiline matching ==> Caso tenha quebras de linha

  No exemplo abaixo colocamos o g no final da expressão para que retornasse todos os valores da string que correspondem as regras da expressão
*/


var regExp = /\(\d{2}\)\s\d{4,5}-?\d{4}/g
var telefone = '(51) 998621234 (51) 99860182 (51) 752621234 (51) 192746297'
console.log(telefone.match(regExp)) // retorna true or falser