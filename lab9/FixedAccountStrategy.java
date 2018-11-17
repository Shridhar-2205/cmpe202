public class FixedAccountStrategy implements InterestStrategy {

	public FixedAccountStrategy() { }

	@Override
	public double calculateInterest(double amount) {

		System.out.println("Fixed Account");

		double interest = amount * 0.09;
		return interest;
	}
}