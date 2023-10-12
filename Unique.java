package sahil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(5);
		System.out.println(list);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
	}

}
