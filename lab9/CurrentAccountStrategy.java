public class CurrentAccountStrategy implements InterestStrategy {

	public CurrentAccountStrategy() { }

	@Override
	public double calculateInterest(double amount) {

		System.out.println("Current Account");

		double interest = amount * 0.02;
		return interest;
	}
}