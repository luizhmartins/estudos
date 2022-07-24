var regExp = /\(48\) 9999-9999/; // Ao colocar o simbolo \ antes de abrir e fechar parenteses, tornamos os simbolos de parentes literais, porque sem isso, os parentes significam outra coisa dentro de regex.
var telefone = '(48) 9999-9999'

console.log(regExp.test(telefone)) // retorna true or false
console.log(regExp.exec(telefone)) // retorna mais informações sobre a comparação