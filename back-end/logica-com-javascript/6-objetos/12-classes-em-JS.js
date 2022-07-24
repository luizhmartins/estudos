class Cliente {
  constructor (nome, cpf, email, saldo) {
  this.nome = nome
  this.cpf = cpf
  this.email = email
  this.saldo = saldo
  }
  depositar(valor) {
    this.saldo += valor
  }
  exibirSaldo() {
    console.log(this.saldo)
  }
}

const Luiz = new Cliente('Luiz', '15498516844', 'luizmartins@email.com', 100);
console.log(Luiz);
Luiz.depositar(1000);
Luiz.exibirSaldo();
