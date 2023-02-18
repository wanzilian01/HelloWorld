let spaceship = {
  'Fuel Type' : 'Turbo Fuel',
  'Active Mission' : true,
  homePlanet : 'Earth', 
  numCrew: 5
 };   
 //在访问其中包含数字、空格或特殊字符的键时，我们必须使用括号表示法。在这些情况下如果没有方括号，我们的代码就会抛出错误。
let propName =  'Active Mission';

const isActive = spaceship['Active Mission'];
console.log(spaceship['Active Mission']); 

//returnAnyProp()如果我们尝试用点符号 ( )编写我们的函数objectName.propName，
//计算机将在我们的对象上查找键'propName'而不是参数的值propName。
let returnAnyProp = (objectName, propName) => objectName[propName];
 
returnAnyProp(spaceship, 'homePlanet'); // Return 'Earth'