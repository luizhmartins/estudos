class Cliente {
  constructor(nome, email, cpf, saldo) {
    this.nome = nome,
    this.email = email,
    this.cpf = cpf,
    this.saldo = saldo
  }
  depositar(valor) {
    this.saldo += valor;
  }
  exibirSaldo() {
    console.log(this.saldo);
  }
}

// Herança de classes

class ClientePoupanca extends Cliente{
  constructor(nome, email, cpf, saldo, saldoPoupanca) { // identificar todos os atributos da classe pai e os adicionais
    super(nome, email, cpf, saldo) // identificar todos os atributos que serão herdados da classe pai
    this.saldoPoupanca = saldoPoupanca // criar o construtor do novo atributo adicionado a esta classe
  }
  depositarPoupanca(valor) {
    this.saldoPoupanca += valor
  }
}

const Luiz = new ClientePoupanca('Luiz', 'luiz@email.com', '154316543165', 1000, 1500);
console.log(Luiz)
Luiz.exibirSaldo()