public abstract class CondimentDecorator extends Beverage {
    // Store reference to wrappee (Component) here
    protected Beverage beverage;
    public abstract String getDescription();
}
