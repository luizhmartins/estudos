/*

  1 - Quais são os dados de entrada necessários?
  2 - O que devo fazer com estes dados?
  3 - Quais são as restrições deste problema?
  4 - Qual o resultado esperado?
  5 - Qual é a sequência de passos a serem feitas para chegar ao resultado esperado?

*/

var andares = 20;
var inicio = 15;
var meta = 10;
var cima = 17;
var baixo = 8;
var qtdApert = 0;

if(cima == 0 || baixo == 0) {
  console.log('Use as escadas!');
}else {
  while(inicio != meta) {
    if(inicio < meta) {
      while(inicio < meta) {
        inicio += cima;
        qtdApert++;
      }
    }else if(inicio > meta) {
      while(inicio > meta) {
        inicio -= baixo;
        qtdApert++;
      }
    }
  }
  console.log(`Você chegou na meta, andar ${meta} com ${qtdApert} apertos no botão!`)
}

