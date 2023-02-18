const robot = {
	_model: '1E78V2',
	_energyLevel: 100,
	_numOfSensors: 15,
	
	get numOfSensors() {
		if (typeof this._numOfSensors === 'number') {
			return this._numOfSensors;
		} else {
			return 'Sensors are currently down.'
		}
	},
	set numOfSensors(num) {
		if (typeof num === 'number' && num >= 0) {
			this._numOfSensors = num;
		} else {
			console.log('Pass in a number that is greater than or equal to 0')
		}
	}
};
//通常，调用 getter 和 setter 方法不需要使用一组括号。从语法上看，我们正在访问一个属性
robot.numOfSensors = 100; 
console.log(robot.numOfSensors);




