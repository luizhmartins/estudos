/*
  Exemplo para uma função de uma linha
*/
const soma = (num1,num2) => num1 + num2; // Se tiver apenas uma linha não é necessário usar return
console.log(soma(2,2));

/*
  Exemplo para uma função com mais de uma linha
*/
const apresentar = (num1,num2) => { // Se tiver mais de uma linha é necessário usar return
  if(num1 > 3 || num2 > 3) {
    return 'Existe um número maior que 3'
  }else{
    return 'Não existe nenhum número maior que 3'
  }
}
console.log(apresentar(4,2));