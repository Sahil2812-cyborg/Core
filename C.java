package sahil;

public class C {
	void print() {
		print(5);
	}

	void print(int num) {
		print(num, 1, 5);
	}

	void print(int num, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", num, i, num * i).println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication Table");
		C c = new C();
		c.print(3);
	}
}
