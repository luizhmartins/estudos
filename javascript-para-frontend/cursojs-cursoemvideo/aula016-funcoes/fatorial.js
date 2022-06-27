// Fatorial com Recursividade
/*
function fatorial(num) {
  if (num == 0) {
    res = 1
    return res
  }else {
    res = num * (fatorial(num-1))
  }
  return res
}
console.log(fatorial(5))
*/

// Fatorial com For

function fatorial(num) {
  var fat = num

  for (num; num>1;num--) {
    fat *= (num-1)
  }
  return fat
}

// Fatorial com while

/*function fatorial(num) {
  var fat = num
  while (num > 1) {
    fat *= (num-1)
    num--
  }
  return fat
}*/

console.log(fatorial(5))