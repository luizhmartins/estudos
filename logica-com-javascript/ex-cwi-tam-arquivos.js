const units = ['KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'];

var num = 2000000000000000000000000;
var arrVals = [];

if(num < 1024) {
  console.log(`${num.toFixed(2)} B`);
}else{
  for(let c=0; c < units.length; c++) {
    arrVals[c] = num/=1024;
  }
  for(let c=0; c < arrVals.length; c++) {
    if(arrVals[c] >= 1){
      var index = c;
    }
  }
  console.log(`${arrVals[index].toFixed(2)} ${units[index]}`)
}