const nomes = ['Luiz', 'Karol', 'Valdeci', 'Rita', 'João'];

const nomesA = nomes.filter(nome => nome.length < 5);
console.log(nomesA);

/*
  O método possui retorno, então é necessário ter uma const para receber os resultados;
  O método filter() faz uma comparação e retorna apenas se for true, caso a comparação seja false, o elemento em questão é ignorado
*/