var regExp = /\(\d{2}\)\s\d{4,5}-?\d{4}/g
var telefone = '(51) 998621234 (51) 99860182 (51) 752621234 (51) 192746297'
console.log(telefone.replace(regExp, 'telefone')) // retorna true or falser

var arr = telefone.split(' ')
console.log(arr[2])