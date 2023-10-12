package sahil;


public class Palindrome {
	// using string builder class
	public boolean isPalin(String s) {
		StringBuilder sb = new StringBuilder(s);
		String res = sb.reverse().toString();
		if (res.equals(s)) {
			return true;
		}
		return false;
	}

	// Using pointers
	public boolean ispalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.ispalindrome("bob"));
	}

}
