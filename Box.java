package sahil;

public class Box {
	double l;
	double w;
	double h;

	Box() {
		this.h = -1;
		this.l = -1;
		this.w = -1;
	}

	// Cube
	Box(double side) {
		this.w = side;
		this.l = side;
		this.h = side;
	}

	Box(double l, double w, double h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	Box(Box old) {
		this.l = old.l;
		this.w = old.w;
		this.h = old.h;
	}

	public void info() {
		System.out.println("This is box class method");
	}


}
