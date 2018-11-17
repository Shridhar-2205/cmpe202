public class SavingsAccountStrategy implements InterestStrategy {

	public SavingsAccountStrategy() { }

	@Override
	public double calculateInterest(double amount) {

		System.out.println("Savings Account");

		double interest = amount * 0.04;
		return interest;
	}
}