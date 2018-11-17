import java.util.Arrays;
import java.util.List;

public class InterestStrategyMainWithLambda {

	public static void main(String [] args) {

		//Create a List of Tax strategies for different scenarios with inline logic using Lambda
		List<InterestStrategy> taxStrategyList =
				Arrays.asList(
						(amount) -> { System.out.println("Current Account"); return 0.020 * amount; },
						(amount) -> { System.out.println("Savings Account"); return 0.040 * amount; },
						(amount) -> { System.out.println("Fixed Deposit"); return 0.090 * amount; }
			);

		//Calculate Tax for different scenarios with corresponding strategies
		taxStrategyList.forEach((strategy) -> System.out.println(strategy.calculateInterest(30000.0)));
	}
}