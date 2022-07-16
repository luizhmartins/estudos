
var nomes = [{
  nome:'Karol',
  num1:2,
  num2:2,
  num3:1,
},
{
  nome:'Luiz',
  num1:3,
  num2:3,
  num3:3,
},
{
  nome:'Jorge',
  num1:2,
  num2:3,
  num3:3,
}]


nomes.sort(function(a,b) {
  if (a.num1 < b.num1) {
    return -1;
  }else {
    return true;
  }
})
console.log(nomes)