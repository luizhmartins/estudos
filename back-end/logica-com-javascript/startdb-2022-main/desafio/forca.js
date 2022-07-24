class Forca {
  constructor(palavraSecreta, resultados = {
    letrasChutadas: [], // Deve conter todas as letras chutadas
    vidas: 6, // Quantidade de vidas restantes
    palavra: '_'.repeat(palavraSecreta.length).split('') // Deve ser um array com as letras que já foram acertadas ou o valor "_" para as letras não identificadas
  }) {
    this.palavraSecreta = palavraSecreta;
    this.resultados = resultados;
  }

  chutar(letra) {
    if (letra.length < 1 || letra.length > 1 || this.resultados.letrasChutadas.includes(letra)) {
      return 0;
    }else if(this.palavraSecreta.includes(letra)) {
      let indices = [];
      this.palavraSecreta
      .split('')
      .forEach((letter, index) => {if(letter === letra) indices.push(index)});
      this.resultados.letrasChutadas.push(letra);
      indices.forEach(index => this.resultados.palavra[index] = letra);
    }else {
      this.resultados.letrasChutadas.push(letra);
      this.resultados.vidas--;
    }
  }
  
  buscarEstado() { 
    if(this.resultados.vidas > 0 && this.palavraSecreta === this.resultados.palavra.join('')) {
      return 'ganhou';
    }else if(this.resultados.vidas < 1) {
      return 'perdeu';
    }else {
      return 'aguardando chute';
    }
  } // Possiveis valores: "perdeu", "aguardando chute" ou "ganhou"

  buscarDadosDoJogo() {
    return this.resultados;
  }
}
module.exports = Forca;
