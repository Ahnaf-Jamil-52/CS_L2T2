public class Espresso extends Beverage {
    // Went to do a wrong thing -> overriding getDescription() of Beverage is not needed,
    // because we inherit the description instance variable from Beverage.

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost(){
        return 1.99;
    }
}
