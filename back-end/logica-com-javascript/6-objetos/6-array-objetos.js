var cliente = {
  nome: 'Luiz',
  cpf: 123456789,
  idade: 25,
  telefones: ['789465132','123456984'], // telefones é um dado do tipo array
  dependentes: [{ // Array de objetos
    nome: 'Karol',
    idade: 22,
    cpf: '1321649684',
    parentesco: 'Namorada'
  }]
}

// Adicionando objeto dentro de um array de objetos

cliente.dependentes.push({
  nome: 'João',
  idade: 23,
  cpf: '1321943616897',
  parentesco: 'Irmão'
})

console.log(cliente)

var idadeMaior = cliente.dependentes.filter(dependente => dependente.idade > 22); // filtrando dependentes com idade maior que 22 anos

console.log(idadeMaior[0].nome); // mostrando o nome do dependente com idade maior que 22 anos