var cliente = {
  nome: 'Luiz',
  cpf: 123456789,
  idade: 25,
  telefone: 789465132
}

/*
  Normalmente utilizado para passar a chave como um parametro de uma função.
  No exemplo abaixo foi utilizado o metodo forEach, que irá percorrer cada elemento do array chaves e a cada iteração irá exibir o objeto cliente na chave atual (info) do array (chaves).
  Por baixo dos panos o parametro que está sendo passado a cada iteração seria:
  console.log(cliente['nome'])
  console.log(cliente['cpf'])
  console.log(cliente['idade'])
  console.log(cliente['telefone'])
*/
var chaves = ['nome', 'cpf', 'idade', 'telefone'];

chaves.forEach(info => console.log(cliente[info]));