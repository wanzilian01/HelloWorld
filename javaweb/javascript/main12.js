const plantNeedsWater = function(day) {
	if (day === 'Wednesday') {
		return true;
	} else {
		return false;
	}
};
//const 用于声明一个或多个常量，声明时必须进行初始化，且初始化后值不可再修改;
//const 的本质: const 指向声明的变量的地址，该指向地址不可变。但其定义的对象、数组或函数的内部其实是可变的。

plantNeedsWater('Tuesday');

console.log(plantNeedsWater('Tuesday'));

/*箭头写法
const plantNeedsWater = (day) => {
  if (day === 'Wednesday') {
	return true;
  } else {
	return false;
  }
}; */