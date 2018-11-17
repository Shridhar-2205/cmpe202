public class SavingsAccountStrategy implements InterestStrategy {

	public SavingsAccountStrategy() { }

	@Override
	public double calculateInterest(double amount) {

		System.out.println("Savings Account");

		double tax = amount * 0.04;
		return tax;
	}
}