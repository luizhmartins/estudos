var regExp = /9999-9999/;
var telefone = '9999-9999'

console.log(regExp.test(telefone)) // retorna true or false
console.log(regExp.exec(telefone)) // retorna mais informações sobre a comparação