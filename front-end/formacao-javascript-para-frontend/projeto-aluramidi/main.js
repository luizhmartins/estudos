function tocaSom (idElementoAudio) {
  document.querySelector(idElementoAudio).play();
}

//document.querySelector('.tecla_pom').onclick = tocaSomPom;
const listaDeTeclas = document.querySelectorAll('.tecla');

for(let c=0; c < listaDeTeclas.length; c++){
  const tecla = listaDeTeclas[c];
  const instrumento = tecla.classList[1];

  tecla.onclick = function() {
    tocaSom(`#som_${instrumento}`)
  }
}
