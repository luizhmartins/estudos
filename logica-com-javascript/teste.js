var s = 'bitcoin take over the world maybe who knows perhaps';

var str = s.split(' ')
var shortestWord = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
  
for(let c=0; c < str.length; c++) {
  if(str[c].length < shortestWord.length){
    shortestWord = str[c];
  }
}
console.log(shortestWord);

