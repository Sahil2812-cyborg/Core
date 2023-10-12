package sahil;

public class MotorBike {
	// state
	private int speed;

	// behavior
	void start() {
		System.out.println("Bike Started");
	}

	// setter Speed
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// getter Speed
	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int val) {
		this.speed = this.speed + val;
	}
}
