var nome = 'Luiz Martins'; // tamanho = 12 posições.

console.log(nome.padEnd(15,'.')); // Luiz Martins...

/*
  Este método possui dois parametros
  1°- número de posições que a string deve conter
  2°- o caractere que irá preencher a string no final para completar o número de posições faltantes.
  Obs.: Se o segundo parametro não for preenchido, a string será completada com espaços.
*/