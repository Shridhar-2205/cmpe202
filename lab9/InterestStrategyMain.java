import java.util.Arrays;
import java.util.List;

public class InterestStrategyMain {

	public static void main(String [] args) {

		//Create a List of Tax strategies for different scenarios
		List<InterestStrategy> taxStrategyList =
				Arrays.asList(
						new CurrentAccountStrategy(),
						new SavingsAccountStrategy(),
						new FixedAccountStrategy());

		//Calculate Tax for different scenarios with corresponding strategies
		for (InterestStrategy taxStrategy : taxStrategyList) {
			System.out.println(taxStrategy.calculateInterest(30000.0));
		}
	}
}