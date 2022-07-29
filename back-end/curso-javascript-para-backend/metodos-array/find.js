const nomes = ['Luiz', 'Karol', 'Valdeci', 'Rita', 'João'];

const nomesA = nomes.find(nome => nome.length < 5);
console.log(nomesA);

/*
  O método possui retorno, então é necessário ter uma const para receber os resultados;
  O método find() retorna o valor do primeiro elemento do array que satisfizer a função de teste provida. Caso contrario, undefined é retornado.
  Muito semelhante ao método filter(), porém o filter retorna um ou mais elementos do array que satisfazem a função.
*/