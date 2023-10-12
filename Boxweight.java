package sahil;

public class Boxweight extends Box {
	double weight;

	public Boxweight() {
		// TODO Auto-generated constructor stub
		this.weight = -1;
	}

	public Boxweight(double l, double w, double h, double weight) {
		super(l, w, h);
		this.weight = weight;
	}

	@Override
	public void info() {
		System.out.println("This is boxweight class method");
	}

}