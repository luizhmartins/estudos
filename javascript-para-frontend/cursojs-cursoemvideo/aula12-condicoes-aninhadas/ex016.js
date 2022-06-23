/*
  Pegando a hora do sistema
  - Primeiro criamos a variável hora e instanciamos ela com a classe Date(), agora esta varável é um objeto de Date(), portanto possui atrbutos e métodos;
  - Através do método .getHours() conseguimos pegar a hora atual do sistema.
*/

var hora = new Date()
console.log(`Agora são exatamente ${hora.getHours()} horas`)
if (hora < 5) {
  console.log('Boa madrugada!')
}else if (hora < 12) {
  console.log(`Bom dia!`)
}else if (hora <=18) {
  console.log('Boa tarde!')
}else {
  console.log ('Boa noite!')
}