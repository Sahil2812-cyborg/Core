package sahil;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(200);
		honda.setSpeed(180);

		// How to increase the speed by 100
		//		int ducatiSpeed = ducati.getSpeed();// 1. get ducati speed
		//		ducatiSpeed += 100;// 2. increase speed by 100
		//		ducati.setSpeed(ducatiSpeed);// 3. set it back to ducati

		ducati.increaseSpeed(199);
		honda.increaseSpeed(150);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
