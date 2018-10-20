public class PremiumCheese extends BurgerDecorator
{
     public PremiumCheese(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }


    public double cost() {

        double costForPCheese = (options.length)*1.50;

        return costForPCheese + burger.cost();
    }
}
