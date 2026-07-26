public class StarbuzzCoffee {
    public static void main(String[] args) {
        // IMP: Client communicates with instace of
        // Component (Beverage) interface or Abs.Class
        String request1 = "Espresso";
        Beverage beverage1 = StarbuzzCoffee.takeOrder(request1);

        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));

        String request2 = "House Blend";
        Beverage beverage2 = StarbuzzCoffee.takeOrder(request2);

        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));

        String request3 = "Dark Roast";
        Beverage beverage3 = StarbuzzCoffee.takeOrder(request3);

        beverage3 = new Soy(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));

    }

    public static Beverage takeOrder(String request){
        switch (request.toLowerCase()) {
            case "house blend":
                return new HouseBlend();
            case "dark roast":
                return new DarkRoast();
            case "decaf":
                return new Decaf();
            case "espresso":
                return new Espresso();
            default:
                throw new IllegalArgumentException("Not on the menu!");
        }
    }
}
