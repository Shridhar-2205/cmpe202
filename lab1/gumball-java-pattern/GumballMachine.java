

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State incomPaymentState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int price;
	String coin_type;
	int incom_payment;
 
	public GumballMachine(int numberGumballs, int price, String coin_type) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		incomPaymentState = new IncomPaymentState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
 		
 		this.price = price;
 		this.coin_type = coin_type;
 		this.incom_payment = 0;
	}
 
	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
	
	int getPrice() {
		return price;
	}
	
	String getCoin_type() {
		return coin_type;
	}
	
	int getIncomPayment() {
		return incom_payment;
	}
	
	void setIncomPayment(int coin) {
		this.incom_payment += coin;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoPaymentState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }
    
    public State getIncomPaymentState() {
        return incomPaymentState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
