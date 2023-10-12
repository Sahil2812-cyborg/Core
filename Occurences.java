package sahil;
import java.util.HashMap;

public class Occurences {

	public static HashMap<Character, Integer> letterCounter(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		String s = str.replaceAll("\\s", "").toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		return map;
	}

	public static HashMap<String, Integer> wordCounter(String str) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];

			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordCounter("The fox is kinda bad fox bad"));

	}

}
