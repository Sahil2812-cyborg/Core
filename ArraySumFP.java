package functional_programming;

import java.util.ArrayList;

public class ArraySumFP {

	public static void runningSum(ArrayList<Integer> list) {
		int res = list.stream().filter(item -> item % 2 != 0).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(2);
		runningSum(l);

	}

}
