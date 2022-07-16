var nums = '1, 2, 3, 4, 5';

console.log(nums.replace(',',':')); // 1: 2, 3, 4, 5

/*
  O método replace irá modificar um caactere por outro dentro de uma string
  Ele modifica apenas a primeira ocorrencia do caractere informado, ou seja, se houver mais de um caractere, apenas o primeiro que aparecer será alterado.
  Para alterar todas as correnpondencias deverá ser utilzado o método replaceAll().
*/