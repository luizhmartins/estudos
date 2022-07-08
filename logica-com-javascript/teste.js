var str = 'xXooo'

var regX = /x/ig;
var regO = /o/ig;

var contX = str.match(regX);
console.log(contX.length)
var contO = str.match(regO);
console.log(contO.length)

if(contX.length == contO.length) console.log('true');
else console.log('false');

