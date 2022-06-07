const botaoMenu = window.document.querySelector('.cabecalho__menu')
const menu = window.document.querySelector('.menu__lateral')

botaoMenu.addEventListener ('click', () => {
  menu.classList.toggle('menu__lateral--ativo')
})