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

// percorrendo objeto com o metodo for in (metodo de objetos)

for(let info in cliente) {
  if(typeof cliente[info] === 'object' || typeof cliente[info] === 'function') {
    continue // continua iterando sem fazer nada
  }else { // se não, mostra na tela as infos
    console.log(`${info} = ${cliente[info]}`);
  }
}