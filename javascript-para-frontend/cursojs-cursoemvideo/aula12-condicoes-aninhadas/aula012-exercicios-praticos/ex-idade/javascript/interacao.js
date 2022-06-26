var data = new Date()
var anoAtual = data.getFullYear()
var res = window.document.querySelector('#res')

function verificar() {
  var txtAno = window.document.querySelector('#txtAno')
  var anoNasc = Number(txtAno.value)
  var sexo = window.document.getElementsByName('radsex')

  if (txtAno.value.length == 0 || anoNasc > anoAtual) {
    res.innerHTML = `Informações inválidas. Tente novamente!`
  }else{
    var idade = anoAtual - anoNasc
    var genero = ''
    var img = window.document.createElement('img')

    if (sexo[0].checked) {
      //mulher
      genero = 'mulher'

      if (idade < 16) {
        //criança
        img.setAttribute('src', 'crianca-f.png')
      }else if (idade <65) {
        //jovem
        img.setAttribute('src', 'jovem-f.png')
      }else {
        //idoso
        img.setAttribute('src', 'idoso-f.png')
      }
    }else{
      //homem
      genero = 'homem'

      if (idade < 16) {
        //criança
        img.setAttribute('src', 'crianca-m.png')
      }else if (idade <65) {
        //jovem
        img.setAttribute('src', 'jovem-m.png')
      }else {
        //idoso
        img.setAttribute('src', 'idoso-m.png')
      }
    }

    res.innerHTML = `Detectamos um(a) ${genero} de ${idade} anos`
    res.appendChild(img)
    img.style.paddingTop='15px'
  }
}