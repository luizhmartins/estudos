/*
No JavaScript o método .getDay() retorna o número do dia da semana do sistema, porém ele retorna um valor numerico. E a relação dos valores e dias da semana estão representados abaixo:

  0 - Domingo
  1 - Segunda
  2 - Terça
  3 - Quarta
  4 - Quinta
  5 - Sexta
*/

var diaSem = new Date()

switch (diaSem.getDay()) {
  case 0:
    console.log('Domingo')
    break
  case 1:
    console.log('Segunda')
    break
  case 2:
    console.log('Terça')
    break
  case 3:
    console.log('Quarta')
    break
  case 4:
    console.log('Quinta')
    break
  case 5:
    console.log('Sexta')
    break
  case 6:
    console.log('Sabado')
    break
  default:
    console.log('Fatal Error')
    break
}
