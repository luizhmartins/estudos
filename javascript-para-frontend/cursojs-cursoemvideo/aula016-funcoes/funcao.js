var n1 = 17253

console.log(`O número ${n1} é ${parimpar(n1)}`)

function parimpar(num) {
  if(num % 2 == 0) {
    return 'par'
  }else {
    return 'impar'
  }
}