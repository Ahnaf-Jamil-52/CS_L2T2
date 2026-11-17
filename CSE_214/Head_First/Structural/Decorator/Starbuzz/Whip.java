public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    // Another miss -> forgot to include beverage.getDescription() here!!
    @Override
    public String getDescription(){
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public double cost(){
        return 0.10 + beverage.cost();
    }
}