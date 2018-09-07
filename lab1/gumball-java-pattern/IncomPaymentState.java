
public class IncomPaymentState implements State {

	GumballMachine gumballMachine;

	public IncomPaymentState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(int coin) {
		System.out.println("You inserted a coin");
		if(gumballMachine.getCoin_type().equals("Quarter") && coin != 25) {
			System.out.println("Sorry! Only quarters accepted.");
		} else {
			if(coin >= gumballMachine.getPrice()) {
				gumballMachine.setState(gumballMachine.getHasCoinState());
			} else {
				gumballMachine.setIncomPayment(coin);
				if(gumballMachine.getIncomPayment() >= gumballMachine.getPrice()) {
					gumballMachine.setState(gumballMachine.getHasCoinState());
				} else {
					gumballMachine.setState(gumballMachine.getIncomPaymentState());
				}
			}
		}
	}

	public void turnCrank() {
		System.out.println("You turned, but payment not completed");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for payment to be completed";
	}

}
