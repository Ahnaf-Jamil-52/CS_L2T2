public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaffeinated Drink";
    }

    @Override
    public double cost(){
        return 1.05;
    }
}