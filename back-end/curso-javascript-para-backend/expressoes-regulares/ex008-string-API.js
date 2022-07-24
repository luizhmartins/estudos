/*
  String API

  match = Executa uma busca na string e retorna um array contendo os dados encontrados, ou null

  aplit = Divide a string com base em uma outra string fixa ou espressão regular

  replace = Substitui partes da string com base em uma outra string fixa ou expressão regular
*/

var regExp = /\(\d{2}\)\s\d{4,5}-?\d{4}/;
var telefone = '(51) 998621234 (51) 99860182 (51) 752621234 (51) 192746297'
console.log(telefone.match(regExp)) // retorna true or falser