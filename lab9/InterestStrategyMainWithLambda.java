import java.util.Arrays;
import java.util.List;

public class InterestStrategyMainWithLambda {

	public static void main(String [] args) {

		List<InterestStrategy> interestStrategyList =
				Arrays.asList(
						(amount) -> { System.out.println("Current Account"); return 0.020 * amount; },
						(amount) -> { System.out.println("Savings Account"); return 0.040 * amount; },
						(amount) -> { System.out.println("Fixed Deposit"); return 0.090 * amount; }
			);

		
		interestStrategyList.forEach((strategy) -> System.out.println(strategy.calculateInterest(30000.0)));
	}
}