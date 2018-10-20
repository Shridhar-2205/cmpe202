
import java.util.ArrayList;

public class Composite implements BurgerComponent {

    private ArrayList<BurgerComponent> components = new ArrayList<BurgerComponent>()  ;
    private String description ;
    private Double price =0.00;
    
    public Composite ( String d )
    {
        description = d ;
    }

	public void printDescription() {
		System.out.println( description );
        System.out.println( "\n" );
        for (BurgerComponent obj  : components)
        {
            this.price+=obj.cost();
            obj.printDescription();
            System.out.println( "\n" );
        }
      
    }

	public void addChild(BurgerComponent c) {
        components.add( c ) ;
	}
	 
	public void removeChild(BurgerComponent c) {
        components.remove(c) ;
	}
	 
	public BurgerComponent getChild(int i) {
	    return components.get( i ) ;
	}
	 
	public double cost()
	{
	    return price;
	   }
}
 
