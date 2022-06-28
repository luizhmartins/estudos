/*
  ^ = Siginifica que a comparação da string irá iniciar a partir deste simbolo
  $ = Siginifica que a comparação da string irá terminar onde tiver este simbolo

  No exemplo abaixo o resultado do test será false, pois está definido que a comparação irá iniciar no (48) e irá terminar no 9999 e na string telefone tem a frase "O numero" antes e "pertence a João" depois
*/

var regExp = /^\(48\) 9999-9999$/;
var telefone = 'O número (48) 9999-9999 pertence a João'

console.log(regExp.test(telefone)) // retorna true or false
console.log(regExp.exec(telefone)) // retorna mais informações sobre a comparação