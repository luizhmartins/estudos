const str = 'a1234567'
const regUpperCase = /[A-Z]/g
const regLowerCase = /[a-z]/g
const regDigit = /[0-9]/g

const hasUpperCase = regUpperCase.test(str);
const hasLowerCase = regLowerCase.test(str);
const hasDigit = regDigit.test(str);
const hasLength = str.length >= 8 && str.length <= 32;

if(hasUpperCase == true && hasLowerCase == true && hasDigit == true && hasLength == true) {
  console.log('1')
}else{
  console.log('0')
}