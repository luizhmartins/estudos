var num = [8, 1, 4, 7, 2, 9]

//inserir e ordenar valores de arrays
num.push(3)
num.sort()

console.log(`${num}`)

//maneira tradicional de percorrer um array
/*
for (var c=0; c <= num.length; c++) {
  console.log(`No indice ${c} tem o valor ${num[c]}`)
}*/

//maneira simplificada de percorrer vetores
for (var pos in num) {
  console.log(`No indice ${pos} está o valor ${num[pos]}`)
}

//encontrar valores dentro do array
var find = num.indexOf(5)

if (find == -1) {
  console.log('Valor não encontrado')
}else {
  console.log(`O valor ${num[find]} está na posição ${find}`)
}

