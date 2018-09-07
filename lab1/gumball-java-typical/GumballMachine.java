public class GumballMachine
{

    private int num_gumballs;
    private int rate_gumballs;
    private String coin_type;
    private int total_inserted;

    public GumballMachine(int size, int price, String coin_type)
    {
        // initialise instance variables
        this.num_gumballs = size;         //total number of gumballs
        this.coin_type = coin_type;       // type of coin accepted
        this.rate_gumballs = price;       // price of single gumball
        this.total_inserted = 0;          // total is zero initially  
    }

    public void insertCoin(int coin)
    {
    		if(coin != 25 && coin_type.equals("Quarter"))
    		{
    			System.out.println("Sorry! Only quarters are accepted.");
    			return;
    		}
    		this.total_inserted += coin;
    }
    
    public void turnCrank()
    {
	    	if (this.total_inserted >= this.rate_gumballs)
	    	{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			this.total_inserted = 0 ;
	    			System.out.println("Thanks for the payment. Gumball ejected!") ;
	    		}
	    		else
	    		{
	    			System.out.println("No more Gumballs! Sorry, can't return your payment.") ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println("Please insert the full payment for gumball.") ;
	    	}        
    }
}