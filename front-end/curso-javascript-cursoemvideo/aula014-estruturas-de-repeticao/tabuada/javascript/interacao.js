var res = window.document.querySelector('#res')

function tabuada() {
  var txtNum = window.document.querySelector ('#txtNum')
  var num = Number(txtNum.value)
  var c = 1

  while (c <= num) {
    res.innerHTML += `<p>${num} x ${c} = ${num * c}</p>`
    c++
  }
}