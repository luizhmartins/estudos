var numbers = '1,2,3,4,5,6';

var newNumbers = numbers.split(',');

console.log(newNumbers);

/*
  O método split() irá retornar um array de strings
  O parametro do método é o caracteres utilizado para fazer a separação, por exemplo:
  Na string numbers, todos os numeros estão separados por virgula, ou seja, o parametro do metodo split() será a virgula, então tudo o que está entre virgulas será um novo elemento do array newNumbers.
*/