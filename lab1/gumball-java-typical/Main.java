public class Main {

	public static void main(String[] args) {
			GumballMachine gumballMachine;
			System.out.println("Gumball Machine 1:");  
			gumballMachine= new GumballMachine(5, 25, "Quarter"); 
			/*Here 5-Represents the number of gumball 
			 25- Cost of single gumball
			 Only Quarters accepted here
			   */
			gumballMachine.insertCoin(25);
			gumballMachine.turnCrank();
			System.out.println();
			System.out.println("Gumball Machine 2:");	
			gumballMachine = new GumballMachine(5, 50, "Quarter");
			/*Here 5-Represents the number of gumball 
			 50- Cost of single gumball
			 Only Quarter accepted here
			   */
			
			gumballMachine.insertCoin(10);
			gumballMachine.insertCoin(25);
			gumballMachine.insertCoin(25);
			gumballMachine.turnCrank();
			System.out.println();
			System.out.println("Gumball Machine 3:");
			gumballMachine = new GumballMachine(5, 50, "AnyCoin");
			/*Here 5-Represents the number of gumball 
			 50- Cost of single gumball
			 Quarter, nickel, dime accepted here
			   */
			
			gumballMachine.insertCoin(10);
			gumballMachine.insertCoin(5);
			gumballMachine.insertCoin(25);
			gumballMachine.turnCrank();
			gumballMachine.insertCoin(10);
			gumballMachine.turnCrank();
	}
}