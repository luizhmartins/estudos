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

console.log(cliente.saldo);
cliente.depositar(30);
console.log(cliente.saldo)