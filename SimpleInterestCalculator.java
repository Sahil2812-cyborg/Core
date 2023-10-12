package sahil;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int years) {
		BigDecimal res = principle.add(principle.multiply(interest).multiply(new BigDecimal(years)));
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator s = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal ans = s.calculateTotalValue(5);
		System.out.println(ans);

	}

}
