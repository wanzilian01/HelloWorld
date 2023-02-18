function robotFactory(model, mobile) {
	return {
		model,
		mobile,
		beep() {
			console.log('Beep Boop');
		}
	}
}

const newRobot = robotFactory('P-501', false)
console.log(newRobot.model)
console.log(newRobot.mobile)
newRobot.beep();
console.log(newRobot)