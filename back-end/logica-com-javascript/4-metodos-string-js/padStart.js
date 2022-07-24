var nome = 'Luiz Martins'; // tamanho = 12 posições.

console.log(nome.padStart(15,'.')); // ...Luiz Martins

/*
  Este método possui dois parametros. Semelhante ao método padEnd, porém aqui será preenchido o inicio da string.
  1°- número de posições que a string deve conter
  2°- o caractere que irá preencher a string no inicio para completar o número de posições faltantes.
  Obs.: Se o segundo parametro não for preenchido, a string será completada com espaços.
*/