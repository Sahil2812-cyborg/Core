package sahil;

public class Triangle {
	int sides = 3;

	public static void numTriangle() {
		//		for (int i = 1; i < 5; i++) {
		//			for (int j = 1; j < i + 1; j++) {
		//				System.out.print(j);
		//			}
		//			System.out.println();
		//		}
		Triangle t = new Triangle();
		System.out.println(t.sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Triangle.numTriangle();
		int[] arr = { 2, 3, 5, 6 };
		int[] arr2 = arr;
		arr2[0] = 1;
		System.out.println(arr);
		System.out.println(arr2.toString());
		System.out.printf("My name is %s and I am %d ", "sahil", 23);
	}

}


