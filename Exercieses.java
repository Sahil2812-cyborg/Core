package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercieses {
	public static void rangeSum(List<Integer> list) {
		int ans = IntStream.range(1, 11).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(ans);
	}

	public static void lowercase(List<String> list) {
		list.stream().map(element -> element.toLowerCase()).forEach(item -> System.out.println(item));
	}

	public static void length(List<String> list) {
		list.stream().forEach(item -> System.out.println(item.length()));
	}

	public static void squares() {
		IntStream.range(1, 11).map(item -> item * item).boxed().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("BAt");
		list.add("CAt");
		//		list.add(8);
		//		list.add(4);
		//		list.add(9);
		//		list.add(10);
		//		rangeSum(list);
		length(list);

	}

}
