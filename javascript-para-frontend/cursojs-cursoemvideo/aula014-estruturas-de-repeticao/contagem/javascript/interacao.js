var res = window.document.querySelector('#res')

function contagem() {
  var txtinicio = window.document.querySelector('#txtinicio')
  var inicio = Number(txtinicio.value)
  var txtfim = window.document.querySelector('#txtfim')
  var fim = Number(txtfim.value)
  var txtpasso = window.document.querySelector('#txtpasso')
  var passo = Number(txtpasso.value)
  res.innerHTML = ''

  for(inicio; inicio<=fim;inicio+=passo) {
    res.innerHTML += ` ${inicio} `
  }
  //res.innerHTML = `Inicio ${inicio} Fim${fim} Passo ${passo}`
}