var hora = new Date()

function verificarHora() {
  var img = window.document.querySelector('#imagem')
  var msg = window.document.querySelector('#msg')
  var fundo = window.document.querySelector('#corpo')
  var horaAtual = hora.getHours()
  //var horaAtual = 21

  msg.innerHTML = `<p>Agora são ${horaAtual} horas</p>`
  if (horaAtual < 12) {
    fundo.style.background='#d99a51'
    img.src='manha.png'

  }else if (horaAtual <18) {
    fundo.style.background='#8c575d'
    img.src='tarde.png'

  }else {
    fundo.style.background='#3e3456'
    img.src='noite.png'
  }
}