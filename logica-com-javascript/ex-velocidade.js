var velMax = 80;
var velUs = 122;

if(velUs < 1) {
  console.log('Velocidade indefinida!');
}else {
  if(velUs <= velMax) {
    console.log('Não houve multa!');
  }else {
    var velAcima = velUs - velMax;
    if(velAcima > 0 && velAcima < 11) {
      console.log('Levou multa leve!');
    }else if(velAcima > 10 && velAcima < 21) {
      console.log('Levou multa grave!');
    }else if(velAcima > 20) {
      console.log('Levou multa gravissima!');
    }
  }



}