package functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp1 {

	public static void printfp(List<String> l) {
		l.stream().forEach(item -> System.out.println(item));
	}

	public static void filterPrintfp(List<String> l) {
		l.stream().filter(
				item -> item.endsWith("g")
		).forEach(item -> System.out.println(item));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Stirng");
		list.add("of");
		list.add("list");
		list.add("Thing");
		list.add("Writing");
		filterPrintfp(list);

	}

}
