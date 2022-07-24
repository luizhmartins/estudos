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
  }],
  saldo: 100,
  depositar: function(valor) {
    this.saldo += valor
  }
}

console.log(Object.keys(cliente)); // cria um array com todas as chaves do objeto
console.log(Object.values(cliente)); // cria um array com todos os valores do objeto
console.log(Object.entries(cliente)); // cria um array com todas as infos de chaves e valores